package br.com.treinaweb.adoteumpet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.com.treinaweb.adoteumpet.core.models.Pet;
import br.com.treinaweb.adoteumpet.core.repositories.PetRepository;

@SpringBootApplication
public class AdoteUmPetApplication implements CommandLineRunner  {

	@Autowired
	private PetRepository petRepository;

	public static void main(String[] args) {
		SpringApplication.run(AdoteUmPetApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		var pet = new Pet();
		pet.setNome("renanzinho");
		pet.setHistoria("historia top");
		pet.setFoto("https://www.purina-latam.com/sites/g/files/auxxlc391/files/styles/social_share_large/public/purina-dia-mundial-dos-animais-protecao-bem-estar-e-saude-do-seu-pet.jpg?itok=wDV_gDHU");
		petRepository.save(pet);
	}

}
