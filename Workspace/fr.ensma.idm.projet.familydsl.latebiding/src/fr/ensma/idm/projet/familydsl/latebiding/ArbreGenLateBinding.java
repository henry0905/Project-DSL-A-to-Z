package fr.ensma.idm.projet.familydsl.latebiding;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.junit.Test;


public class ArbreGenLateBinding {
	@Test
	public void queryArbreGenStructureWithoutGeneratedCode() {
		Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
		Map<String, Object> m = reg.getExtensionToFactoryMap();
		m.put("ecore", new XMIResourceFactoryImpl());
		ResourceSet resourceSet = new ResourceSetImpl();
		URI fileURI = URI.createFileURI("model/famillemm.ecore");
		
		Resource resource = resourceSet.getResource(fileURI, true);
		EPackage ePackage = (EPackage) resource.getContents().get(0);
		EList<EClassifier> eClassifiers = ePackage.getEClassifiers();
		for (EClassifier eClassifier : eClassifiers) {
			System.out.println(eClassifier.getName());
			
			System.out.print(" ");
			if (eClassifier instanceof EClass) {
				// A Compléter
	}
	}
	}
	@Test
	public void createAndSaveArbreGenBookWithMetaModel() throws IOException {
		
		// Objectif 1 : charger le fichier famillemm.ecore
		Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
		Map<String, Object> m = reg.getExtensionToFactoryMap();
		m.put("ecore", new XMIResourceFactoryImpl());
	
		ResourceSet resourceSet = new ResourceSetImpl();
		URI fileURI = URI.createFileURI("model/famillemm.ecore");
		Resource resource = resourceSet.createResource(fileURI);
	
		resource.load(null);
		EPackage ePackage = (EPackage) resource.getContents().get(0);
	
		// Objectif 2 : créer des instances
		EClass famille = (EClass) ePackage.getEClassifier("Famille");
		EAttribute idDeFamille = (EAttribute) famille.getEStructuralFeature("id");
		EReference membresDeFamille = (EReference) famille.getEStructuralFeature("membres");
		EObject uneFamille = ePackage.getEFactoryInstance().create(famille);
		uneFamille.eSet(idDeFamille, "La famille test");
	
		// A compléter : création de certaines personnes
		EClass personne = (EClass) ePackage.getEClassifier("Homme");
		EAttribute nomDePersonne = (EAttribute) personne.getEStructuralFeature("nom");
		EAttribute ageDePersonne = (EAttribute) personne.getEStructuralFeature("age");
		EReference habiationdePersonne = (EReference) personne.getEStructuralFeature("habitation");
		EObject marc = ePackage.getEFactoryInstance().create(personne);
		marc.eSet(nomDePersonne, "Marc");
		marc.eSet(ageDePersonne, 30);
	
		// A compléter : création des adresses
		EClass adresse = (EClass) ePackage.getEClassifier("Adresse");
		EAttribute numeroDeAdresse = (EAttribute) adresse.getEStructuralFeature("numero");
		EAttribute rueDeAdresse = (EAttribute) adresse.getEStructuralFeature("rue");
		EAttribute villeDeAdresse = (EAttribute) adresse.getEStructuralFeature("ville");
		EObject marcAdr = ePackage.getEFactoryInstance().create(adresse);
		marcAdr.eSet(numeroDeAdresse, 44);
		marcAdr.eSet(rueDeAdresse, "larue");
		marcAdr.eSet(villeDeAdresse, "laville");
	
		// A compléter : ajout des adresses aux personnes
	
		marc.eSet(habiationdePersonne, marcAdr);
	
	// A compléter : ajout de la personne à l’instance uneFamille
		List<EObject> membresList = new ArrayList<EObject>();
		membresList.add(marc);
		uneFamille.eSet(membresDeFamille, membresList);
		
		resourceSet = new ResourceSetImpl();
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap()
		.put("xmi", new XMIResourceFactoryImpl());
		URI uri = URI.createURI("model/familleViaDynamicInstanciation.xmi");
		resource = resourceSet.createResource(uri);
		resource.getContents().add(uneFamille);
		resource.save(null);
}
}
