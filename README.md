# Mini‑Projet INF5039 – SimplePDL v2 Transformations




---

## 1. Contexte et objectifs

Ce mini‑projet s’inscrit dans le cadre du cours **INF5039 – Ingénierie Dirigée par les Modèles**.  
L’objectif principal était de : 

1. Étendre le méta‑modèle SimplePDL (v1) en y ajoutant ressources et descriptions textuelles (SimplePDL v2). 
![Meta-Model](/statics/metamodel.png) 
2. Définir et implémenter des contraintes OCL de cohérence.
[Fichier de Contraintes OCL a visiter](mini.projet/model/projet_on_process.ocl)


3. Modéliser deux processus exemples avec Eclipse EMF: 
 - [ Description des phases du processus de d ́eveloppement logiciel ( Modele en V )](mini.projet/model/DevLogicielVModel.xmi)
 -  [ Preparation d’un examen](mini.projet/model/PrepareExamen.xmi)

4. Produire deux transformations Acceleo :
   - **SimplePDLToHTML** : génération d’une documentation HTML; 
      -  [ Fichier de transformation en HTML](SimplePDLToHTML/src/SimplePDLToHTML/main/generate.mtl)
      - [ Fichier de SORTIE de la transformation en HTML](SimplePDLToHTML/ouput_code/DevLogicielVModel.html) 
   - **SimplePDL2DOT** : génération d’un graphe DOT pour Graphviz;
      -  [ Fichier de transformation en DOT](SimplePDL2DOT/src/SimplePDL2DOT/main/generate.mtl) 

      - [ Fichier de SORTIE de la transformation en DOT](SimplePDL2DOT/output_code/DevLogicielVModel.dot) 

5. Syntaxe concrète
   - **Proposer une syntaxe concrète graphique avec Sirius** : 
   ![Meta-Model](/statics/v_model_with_siruis.png) 

   - **Proposer une syntaxe concrète textuelle avec Xtext** : 
      - Coloration
      - Auto Completion
   ![Language reconu](/statics/language_reconu.png)
      - Representation Hierachique de processus defini dans le Langage 
      
      ![Hierachical representation](/statics/hierachical.png)

---

## 2. Prérequis

- **Eclipse IDE** avec plugins :
  - EMF (Eclipse Modeling Framework)  
  - Acceleo  
- **Java 11+** (JDK)  
- **Graphviz** (optionnel pour visualiser les `.dot`)  
- Navigateurs web pour consulter les rapports HTML  

---

## 3. Installation & Import des projets

1. **Cloner ou extraire** ce dépôt sur votre machine.  
2. Dans Eclipse, **Import ▶ Existing Projects into Workspace** 

---

## 4. Exécution des transformations

### 4.1. Transformer SimplePDL → HTML

1. Ouvrir le projet **SimplePDLToHTML**.  
2. Dans le dossier `src/SimplePDLToHTML.main`, ouvrir le fichier de configuration `generate.mtl` (Run Acceleo Launch Configuration).  
3. En **Source model**, sélectionner un fichier `.xmi` issu de `mini.projet/sample` (ex. `DevLogicielVModel.xmi`).  
4. En **Target folder**, choisir (ou créer) un répertoire `output_code`.  
5. Lancer la génération.  
6. Résultat : un fichier `NomDuProcess.html` dans `output_code`.  
7. Ouvrir dans un navigateur pour consulter la documentation du processus.

### 4.2. Transformer SimplePDL → DOT

1. Ouvrir le projet **SimplePDL2DOT**.  
2. Dans son `src/SimplePDL2DOT.main` configurer de la même façon :  
   - **Source model** : même `.xmi`.  
   - **Target folder** : répertoire `output_code`.  
3. Lancer la génération Acceleo.  
4. Résultat : un fichier `NomDuProcess.dot` dans `output_code`.  


## License

[MIT](https://choosealicense.com/licenses/mit/)

------------------------------------------------------------------------------------------------------------

⭐️ If you find this repository helpful, we’d be thrilled if you could give it a star! 

