

ALTER TABLE Articles_Vendus DROP CONSTRAINT articles_utilisateurs_fk;
ALTER TABLE ARTICLES_VENDUS
    ADD CONSTRAINT articles_utilisateurs_fk FOREIGN KEY ( no_utilisateur ) REFERENCES UTILISATEURS ( no_utilisateur )
	ON DELETE CASCADE
    ON UPDATE NO ACTION 

ALTER TABLE Encheres DROP CONSTRAINT ventes_utilisateurs_fk;
ALTER TABLE ENCHERES
    ADD CONSTRAINT ventes_utilisateurs_fk FOREIGN KEY ( no_utilisateur )
        REFERENCES utilisateurs ( no_utilisateur )
	ON DELETE CASCADE
    ON UPDATE NO ACTION 


	


