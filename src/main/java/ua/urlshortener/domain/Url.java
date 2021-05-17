package ua.urlshortener.domain;

public class Url
{
    private String objectId;
    private String fullUrl;
    private String shortUrl;

    public String getObjectId()
    {
        return objectId;
    }

    public void setObjectId(String objectId)
    {
        this.objectId = objectId;
    }

    public String getFullUrl()
    {
        return fullUrl;
    }

    public void setFullUrl(String fullUrl)
    {
        this.fullUrl = fullUrl;
    }

    public String getShortUrl()
    {
        return shortUrl;
    }

    public void setShortUrl(String shortUrl)
    {
        this.shortUrl = shortUrl;
    }
}