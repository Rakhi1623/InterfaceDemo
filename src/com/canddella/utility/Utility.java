package com.canddella.utility;

import com.canddella.entity.PlatinumCurrentAccount;
import com.canddella.entity.PlatinumSavingsAccount;

public class Utility {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PlatinumCurrentAccount pca = new PlatinumCurrentAccount("PCA1000", "GST10");
		PlatinumSavingsAccount psa = new PlatinumSavingsAccount("PSA100", "10%");
		pca.getCard();;
		pca.deposit();
		psa.getCard();;
		psa.deposit();
	}

	}


