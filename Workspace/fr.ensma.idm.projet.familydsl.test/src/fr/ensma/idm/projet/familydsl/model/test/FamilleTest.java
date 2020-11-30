package fr.ensma.idm.projet.familydsl.model.test;

import java.io.File;
import java.io.IOException;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EContentAdapter;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.junit.Assert;
import org.junit.Test;


import fr.ensma.idm.projet.familydsl.model.arbregen.Adresse;
import fr.ensma.idm.projet.familydsl.model.arbregen.ArbregenFactory;
import fr.ensma.idm.projet.familydsl.model.arbregen.ArbregenPackage;
import fr.ensma.idm.projet.familydsl.model.arbregen.Famille;
import fr.ensma.idm.projet.familydsl.model.arbregen.Femme;
import fr.ensma.idm.projet.familydsl.model.arbregen.Homme;

public class FamilleTest {
	
	@Test
	public void createFamilleTest() {
			Famille uneFamille = ArbregenFactory.eINSTANCE.createFamille();
			
			uneFamille.eAdapters().add(new EContentAdapter() {
				@Override
				public void notifyChanged(Notification notification) {
					System.out.print("Ancienne Valeur : " + notification.getOldValue());
					System.out.println(" Nouvelle Valeur : " + notification.getNewValue());
				}
			});
			uneFamille.setId("la famille test");

			Homme marc = ArbregenFactory.eINSTANCE.createHomme();
			Homme claude = ArbregenFactory.eINSTANCE.createHomme();
			Femme marcelle = ArbregenFactory.eINSTANCE.createFemme();
			// A compléter
			Adresse adr1 = ArbregenFactory.eINSTANCE.createAdresse();
			adr1.setNumero(44);
			adr1.setRue("larue");
			adr1.setVille("laville");
			
			marc.setAge(50);
			marc.setNom("Marc");
			marc.setPere(claude);
			marc.setMere(marcelle);
			marc.setHabitation(adr1);
			
			// A compléter
			
			uneFamille.getMembres().add(claude);
			uneFamille.getMembres().add(marc);
			uneFamille.getMembres().add(marcelle);
			
			// A compléter
			
			Assert.assertEquals(3, uneFamille.getMembres().size());
			Assert.assertEquals("la famille test", uneFamille.getId());
			Assert.assertEquals("Marc", marc.getNom());
			Assert.assertEquals("larue", marc.getHabitation().getRue());

			// A compléter	
			ResourceSet resourceSet = new ResourceSetImpl();
			resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("arbregen", new XMIResourceFactoryImpl());
			
			final String apiSamplePath = "C://Users//lammi//Desktop//Idonnee_modele//runtime-FamilyDSLConfiguration//ExempleInstanceFamille//";
			URI uri = URI.createURI("file:/" + apiSamplePath + "APIFamilleTest.arbregen");
			Resource resource = resourceSet.createResource(uri);
			resource.getContents().add(uneFamille);
				try {
					resource.save(null);
				} catch (IOException e) {
					e.printStackTrace();
				}	
				Assert.assertTrue(new File(apiSamplePath + "APIFamilleTest.arbregen").exists());

				resourceSet = new ResourceSetImpl();
				uri = URI.createURI("file:/" + apiSamplePath + "FamilleTest.arbregen");
				resource = resourceSet.getResource(uri, true);
				uneFamille = (Famille) resource.getContents().get(0);
				Assert.assertNotNull(uneFamille.getMembres());
				Assert.assertEquals(3, uneFamille.getMembres().size());
			}
	@Test
	public void queryArbreGenStructure() {
	ArbregenPackage lePackageRacine = ArbregenPackage.eINSTANCE;
	EList<EClassifier> eClassifiers = lePackageRacine.getEClassifiers();
	
	for (EClassifier eClassifier : eClassifiers) {
		System.out.println(eClassifier.getName());

		System.out.print(" ");

		if (eClassifier instanceof EClass) {
// A Compléter
		}
		}
	}
}
