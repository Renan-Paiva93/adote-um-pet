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
		pet.setNome("Joe");
		pet.setHistoria("O Joe tem 12 anos, raça Fox Paulistinha, quando ele era bebê o Joe foi curado da doença  chamada cinomose canina. Hoje ele está muito bem e vive com Mel, os dois tiveram 4 filhotes juntos.");
		pet.setFoto("https://diariodonordeste.verdesmares.com.br/image/contentid/policy:7.4516754:1621515234/fox-paulistinha_Easy-Resize.com.jpg?f=16x9&$p$f=1af7684");
		petRepository.save(pet);
	}

}
