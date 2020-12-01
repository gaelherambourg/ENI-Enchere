<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>


<%@ include file="layouts/head.jsp" %>
<body>
    <div class="container-fluid">
    <%@ include file="layouts/header.jsp" %>
    
    	<!--main bloc-->
        <main>
            <!--title-->
            <div class="mx-auto text-center">
                <h1>Mon Profile</h1>
                <img class="mb-4 large-icon rounded-circle" src="images/user.svg" alt="">
            </div>
        
            <!--formulaire-->
            <form class="form-register needs-validation" method="post" action="">
                <div class="row">
                    <div class="col-md-6 mb-3">
                        <label for="pseudo">Pseudo</label>
                        <input type="text" class="form-control" id="pseudo" name="pseudo" placeholder="" maxlength="30" required value="${ Utilisateur.pseudo }">
                        <div class="invalid-feedback">
                            Ce champ est invalide !
                        </div>
                    </div>
                
                    <div class="col-md-6 mb-3">
                        <label for="lastname">Nom</label>
                        <input type="text" class="form-control" id="nom" name="nom" placeholder="" value="${ Utilisateur.nom }" maxlength="30" required>
                        <div class="invalid-feedback">
                            Ce champ est invalide !
                        </div>
                    </div>
                </div>
                
                <div class="row">
                    <div class="col-md-6 mb-3">
                        <label for="firstname">Prénom</label>
                        <input type="text" class="form-control" id="prenom" name="prenom" placeholder="" value="${ Utilisateur.prenom }" maxlength="30" required>
                        <div class="invalid-feedback">
                            Ce champ est invalide !
                        </div>
                    </div>
                
                    <div class="col-md-6 mb-3">
                        <label for="email">Email</label>
                        <input type="email" class="form-control" id="email" name="email" placeholder="you@example.com" value="${ Utilisateur.email }" maxlength="20" required>
                        <div class="invalid-feedback">
                            Ce champ est invalide !
                        </div>
                    </div>
                </div>
                
                <div class="row">
                    <div class="col-md-4 mb-3">
                        <label for="phone">Téléphone <span class="text-muted">(Optional)</span></label>
                        <input type="text" class="form-control" id="telephone" name="telephone" placeholder="" value="${ Utilisateur.telephone }" maxlength="15">
                    </div>
                    <div class="col-md-8 mb-3">
                        <label for="street">Rue</label>
                        <input type="text" class="form-control" id="rue" name="rue" placeholder="" value="${ Utilisateur.rue }" maxlength="30" required>
                        <div class="invalid-feedback">
                            Ce champ est invalide !
                        </div>
                    </div>
                </div>
                
                <div class="row">
                    <div class="col-md-4 mb-3">
                        <label for="zipcode">Code postal</label>
                        <input type="number" class="form-control" id="code_postal" name="code_postal" placeholder="" min="01000" max="99999" value="${ Utilisateur.code_postal }" required>
                        <div class="invalid-feedback">
                            Ce champ est invalide !
                        </div>
                    </div>
                    <div class="col-md-8 mb-3">
                        <label for="city">Ville</label>
                        <input type="text" class="form-control" id="ville" name="ville" placeholder="" maxlength="30" value="${ Utilisateur.ville }" required>
                        <div class="invalid-feedback">
                            Ce champ est invalide !
                        </div>
                    </div>
                </div>
                                
				<div class="row">
				    <div class="col-md-6 mb-3">
				        <label for="password">Mot de passe</label>
				        <input type="password" class="form-control" id="mot_de_passe" name="mot_de_passe" placeholder="" minlength="6" maxlength="30" value="${ Utilisateur.mot_de_passe }" required>
				        <div class="invalid-feedback">
				            Ce champ est invalide !
				        </div>
				    </div>
				
				    <div class="col-md-6 mb-3">
				        <label for="confirm_password">Confirmation</label>
				        <input type="password" class="form-control" id="confirm" name="confirm" placeholder="" required>
				        <div class="invalid-feedback">
				            Ce champ est invalide ou les mots de passe sont différents !
				        </div>
				    </div>
				</div>                
                <hr class="mb-4">
                <button class="btn btn-primary btn-lg btn-block" type="submit">Modifier mes informations</button>
            </form>
        </main>
    
    </div>


<%@ include file="layouts/footers.jsp" %>