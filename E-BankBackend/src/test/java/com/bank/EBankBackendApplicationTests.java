package com.bank;

import com.bank.Dao.compteDAO;
import com.bank.Model.compte;
import com.bank.Service.CompteServiceIM;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.any;

import static org.mockito.Mockito.when;

@SpringBootTest
class EBankBackendApplicationTests {

		@InjectMocks
		private CompteServiceIM compteService;

		@Mock
		private compteDAO compteDao;

		@BeforeEach
		public void setUp() {
			MockitoAnnotations.openMocks(this);
		}
//
//		@Test
//		public void testCreerCompte() {
//			compte mockCompte = new compte(1, "courant", 1000.0f, "2023-07-04", null);
//			when(compteDao.save(any(compte.class))).thenReturn(mockCompte);
//
//			compte newCompte = new compte();
//			newCompte.setType_compte("courant");
//			newCompte.setSolde_initial(1000.0f);
//			newCompte.setDate_creation("2023-07-04");
//
//			compte createdCompte = compteService.creerCompte(newCompte);
//
//			assertEquals(mockCompte, createdCompte);
//		}
}
