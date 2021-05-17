<!doctype html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <title>URL-shortener</title>
</head>
<body>
<header class="bg-body border-bottom border-primary fixed-top">
    <div class="container-fluid">
        <div class="row">
            <div class="col-md-3 d-none d-lg-block">
                <a href="/" class="d-flex  col-lg-4 mb-2 mb-lg-0 link-dark text-decoration-none"
                   data-label="Site logo">
                    <img src="assets/img/bisabos.png" height="40px" width="40px">
                </a>
            </div>
            <div class="col-md-6 d-none d-lg-block">
                <div class="d-flex align-items-center">
                    <form class="w-100 me-3" method="post" action="/">
                        <div class="input-group">
                            <input type="text" name="fullUrl" class="form-control"
                                   placeholder="Введите URL для укорачивания...">
                            <button class="btn btn-primary" type="submit">Сократить</button>
                        </div>
                    </form>
                </div>
            </div>
        </div>
    </div>
</header>
<main class="mb-3">
    <#if fullUrl??>
        <div class="container-fluid">
            <div class="row">
                <div class="col-lg-3 col-md-12 col-sm-12 d-none d-lg-block">
                </div>
                <div class="col-lg-6 col-md-12 col-sm-12">
                    <div id="section-title" class="section-title p-1 pt-3">
                        <h2 class="text-center fw-bold">Инфо</h2>
                    </div>
                    <div class="card bg-light shadow bg-body rounded-3 mb-2">
                        <div class="card-body">
                            <p class="card-text">Укороченный URL:
                                <a href="http://localhost:8080/${shortUrl}">
                                    <small>http://localhost:8080/</small><b>${shortUrl}</b>
                                </a>
                            </p>
                            <div class="d-flex text-center border-top border-1 pt-2">
                                <small class="pt-2 pb-2 me-2">
                                    <p class="card-text">Исходный URL:
                                        <a href="${fullUrl}"><small>${fullUrl}</small>
                                        </a>
                                    </p>
                                </small>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </#if>
</main>
<!-- End Footer -->
<link href="/assets/css/bootstrap.min.css" rel="stylesheet">
<!-- Custom styles for this template -->
<link href="/assets/css/style.css" rel="stylesheet">
</body>
</html>