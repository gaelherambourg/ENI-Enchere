<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>


<!--fullHeader-->
        <header>	
            <nav class="pr-5 navbar navbar-expand-sm bg-dark navbar-dark align-top justify-content-between">
                <!-- Brand/logo -->
                <a class="navbar-brand" href="${pageContext.request.contextPath}">
                    <img class="small-icon" src="${pageContext.request.contextPath}/images/trocenchere.svg" alt="Accueil ENI-Encheres">
                    <strong>ENI-Encheres</strong>
                </a>

                <a class="navbar-brand" href="afficherUtilisateur" alt="G�rer mon profil" title="G�rer mon profil">
                    <img class="small-icon" src="${pageContext.request.contextPath}/images/user.svg">
                    <c:if test="${not empty sessionScope.utilisateur }">
                    	<span class="align-middle text-muted">${sessionScope.utilisateur.pseudo }, ${sessionScope.utilisateur.credit } 
                    	
                    	<c:if test="${sessionScope.utilisateur.credit >=1 }">
                    		cr�dits
                    	</c:if>
                    	<c:if test="${sessionScope.utilisateur.credit <2 }">
                    		cr�dit
                    	</c:if>
                    	
                    	</span>
                    </c:if>
                </a>

                <ul class="navbar-nav ml-auto">
                    <!-- Dropdown for small screen -->
                    <li class="nav-item dropdown d-lg-none">
                        <a class="nav-link dropdown-toggle" href="#" id="navbardrop" data-toggle="dropdown">
                            <img class="small-icon" src="${pageContext.request.contextPath}/images/menu.svg" alt="Menu ENI-Encheres">
                        </a>
                        <div class="dropdown-menu">
                        	<c:if test="${not empty sessionScope.utilisateur && sessionScope.utilisateur.isAdministrateur()}">
                            	<a class="dropdown-item" href="#" alt="Administrer le site">Administrer</a> 
                        	</c:if>
                        	<c:if test="${not empty sessionScope.utilisateur }">
	                            <a class="dropdown-item" href="vente" alt="Vendre un article">Vendre un article</a>
	                            <a class="dropdown-item" href="deconnexion" alt="Me d�connecter">Me d�connecter</a>
	                            <a class="dropdown-item" href="MonProfile" alt="Bonjour"><c:out value="${sessionScope.utilisateur.pseudo }" default="&#128540;"></c:out></a>
                            </c:if>
                            <c:if test="${empty sessionScope.utilisateur }">
	                            <a class="dropdown-item" href="inscription" alt="S'inscrire ENI-Encheres">M'inscrire</a>
	                            <a class="dropdown-item" href="connexion" alt="Se connecter ENI-Encheres">Me connecter</a>
                            </c:if>
                        </div>
                    </li>  
                    <!-- Links for medium screen-->
                    <c:if test="${not empty sessionScope.utilisateur && sessionScope.utilisateur.isAdministrateur()}">
	                    <li class="nav-item d-none d-lg-block">
	                        <a class="nav-link" href="#" alt="Administrer le site">Administrer</a>
	                    </li> 
                    </c:if>
                    <c:if test="${not empty sessionScope.utilisateur }">
                    <li class="nav-item d-none d-lg-block">
                        <a class="nav-link" href="afficherUtilisateur" alt="Vendre un article">Vendre un article</a>
                    </li>
                    <li class="nav-item d-none d-lg-block">
                    	<a class="nav-link" href="deconnexion" alt="Me d�connecter">Me d�connecter</a>
                    </li>
                    <li class="nav-item d-none d-lg-block">
                        <a class="nav-link" href="afficherUtilisateur" alt="Bienvenue"><c:out value="${sessionScope.utilisateur.pseudo }" default="&#128540;"></c:out></a>
                    </li>
                    </c:if>
                    <c:if test="${empty sessionScope.utilisateur }">
	                    <li class="nav-item d-none d-lg-block">
	                        <a class="nav-link" href="inscription" alt="S'inscrire ENI-Encheres">M'inscrire</a>
	                    </li>
	                    <li class="nav-item d-none d-lg-block">
	                        <a class="nav-link" href="connexion" alt="Se connecter ENI-Encheres">Me connecter</a>
	                    </li>
                    </c:if>
                </ul>
            </nav>
        </header>