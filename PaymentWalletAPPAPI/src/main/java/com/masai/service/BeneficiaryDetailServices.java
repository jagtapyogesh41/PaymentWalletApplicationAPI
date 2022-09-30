package com.masai.service;

import java.util.List;

import com.masai.exception.BeneficiaryDetailException;
import com.masai.model.BeneficiaryDetail;
import com.masai.model.Customer;

public interface BeneficiaryDetailServices {
	public BeneficiaryDetail addBeneficiary(BeneficiaryDetail beneficiaryDetail) throws BeneficiaryDetailException;
	public BeneficiaryDetail deleteBeneficiary(String customerMob,String benficiaryMob) throws BeneficiaryDetailException;
	public BeneficiaryDetail viewBeneficiaryByMobileNo(String mobNo) throws BeneficiaryDetailException;
	public List<BeneficiaryDetail> viewAllBeneficiary(Customer customer) throws BeneficiaryDetailException;
}
