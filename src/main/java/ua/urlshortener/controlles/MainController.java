package ua.urlshortener.controlles;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import ua.urlshortener.service.MainService;

import javax.servlet.http.HttpServletResponse;

@Controller
public class MainController
{
    @Autowired
    private MainService mainService;

    @GetMapping("/")
    public String getMainPage()
    {
        return "main";
    }

    @PostMapping("/")
    public String main(@ModelAttribute("fullUrl") String fullUrl, Model model)
    {
        if (StringUtils.isBlank(fullUrl)){
            return "error";
        }
        model.addAttribute("shortUrl",mainService.generateShortUrl(fullUrl));
        return "main";
    }

    @GetMapping("/{shortUrls}")
    public String redirectToFullUrl(@PathVariable("shortUrls") String shortUrl, HttpServletResponse httpServletResponse)
    {
        String fullUrl = mainService.loadFullUrl(shortUrl);
        if (fullUrl==null){
            httpServletResponse.setStatus(404);
            return "error";
        }
        return "redirect:" + fullUrl;
    }
}
