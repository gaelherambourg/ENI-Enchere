<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>


<%@ include file="layouts/head.jsp" %>
<body>
    <div class="container-fluid">
        <!--emptyHeader-->
        <header>
            <nav class="pr-5 navbar navbar-expand-sm bg-dark navbar-dark align-top justify-content-between">
                <!-- Brand/logo -->
                <a class="navbar-brand" href="/acceuille">
                    <img class="small-icon" src="images/trocenchere.svg" alt="Accueil ENI-Encheres">
                    <strong>ENI-Encheres</strong>
                </a>
            </nav>
        </header>

        <!--main bloc-->
        <main>
            <!--title-->
            <div class="mx-auto text-center">
                <h1>Connexion</h1>
                <img class="mb-4 large-icon rounded-circle" src="images/user.svg" alt="">
            </div>
            
            </div>
            <!--formulaire-->
            <form class="form-login" action="connexion" method="post">
                <label for="inputIdentifiant" class="sr-only">Identifiant</label>
                <input type="text" id="inputIdentifiant" class="form-control" name="pseudo" placeholder="Pseudo" required autofocus>
                <label for="inputPassword" class="sr-only">Password</label>
                <input type="password" id="inputPassword" class="form-control" name="password" placeholder="Mot de passe" required>
                <div class="checkbox mb-3">
                    <label>
                    <input type="checkbox" name="remember" value="remember"> Se souvenir de moi
                    </label>
                </div>
                <button class="btn btn-lg btn-primary btn-block" type="submit" title="Me connecter">
                	<img class="small-icon" src="images/connect.svg" alt="Me connecter">
                </button>
                <a href="#">Mot de passe oublié</a>
            </form>
        </main>
<%@ include file="layouts/footers.jsp" %>