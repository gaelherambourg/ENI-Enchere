<%@page import="fr.eni.ENIEnchere.messages.LecteurMessage"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>


<%@ include file="layouts/head.jsp"%>
<body>
	<div class="container-fluid">
		<!--emptyHeader-->
		<header>
			<nav
				class="pr-5 navbar navbar-expand-sm bg-dark navbar-dark align-top justify-content-between">
				<!-- Brand/logo -->
				<a class="navbar-brand" href="index.html"> <img
					class="small-icon" src="images/trocenchere.svg"
					alt="Accueil ENI-Encheres"> <strong>ENI-Encheres</strong>
				</a> <a class="navbar-brand" href="#" alt="Gérer mon profil"
					title="Gérer mon profil"> <img class="small-icon"
					src="images/user.svg"> <span class="align-middle text-muted">XXXXX
						xxx, 0 crédit(s)</span>
				</a>
			</nav>
		</header>

		<!--main bloc-->
		<main> <!--title-->
		<div class="mx-auto text-center">
			<h1>Connexion</h1>
			<img class="mb-4 large-icon rounded-circle" src="images/user.svg"
				alt="">
		</div>
	</div>


	<!--formulaire-->
	<form class="form-login" action="connexion" method="post">
		<label for="inputIdentifiant" class="sr-only">Identifiant</label> <input
			type="text" id="inputIdentifiant" class="form-control" name="pseudo"
			placeholder="Pseudo" required autofocus> <label
			for="inputPassword" class="sr-only">Password</label> <input
			type="password" id="inputPassword" class="form-control"
			name="password" placeholder="Mot de passe" required>
		<div class="checkbox mb-3">
			<label> <input type="checkbox" name="remember"
				value="remember"> Se souvenir de moi
			</label>
		</div>
		<button class="btn btn-lg btn-primary btn-block" type="submit"
			title="Me connecter">
			<img class="small-icon" src="images/connect.svg" alt="Me connecter">
		</button>
		<a href="#">Mot de passe oublié</a>
	</form>

	</main>
	
	<c:if test="${not empty listeCodesErreur }">
		<!--erreur-->
		<div class="d-flex alert-danger">
			<div class="col-3 p-2">
				<img class="small-icon" src="images/error.svg">
			</div>
			<ul class="col-9 list-unstyled p-2">
				<c:forEach items="${listeCodesErreur }" var="l">
					<li>${LecteurMessage.getMessageErreur(l)}</li>
				</c:forEach>
			</ul>
		</div>
	</c:if>
	
	<%@ include file="layouts/footers.jsp"%>