package ua.urlshortener.service;

import com.backendless.Backendless;
import com.backendless.persistence.DataQueryBuilder;
import org.apache.commons.lang3.RandomStringUtils;
import org.springframework.stereotype.Service;
import ua.urlshortener.domain.Url;

import java.util.List;

@Service
public class MainService
{
    public String generateShortUrl(String fullUrl)
    {
        //валидация через exception
        Url url = new Url();
        url.setFullUrl(fullUrl);
        url.setShortUrl(RandomStringUtils.randomAlphanumeric(6));
        url = Backendless.Data.save(url);

        return url.getShortUrl();
    }

    public String loadFullUrl(String shortUrl)
    {
        String whereClause = "shortUrl='" + shortUrl + "'";
        DataQueryBuilder queryBuilder = DataQueryBuilder.create();
        queryBuilder.setWhereClause(whereClause);

        List<Url> list = Backendless.Data.of(Url.class).find(queryBuilder);
        for (Url result : list)
        {
            return result.getFullUrl();
        }
        return null;
    }
}
