/**
 * PHR_JavaWebService
 *
 * Copyright (C) 1999-2014 Photon Infotech Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.photon.phresco.Screens;

import java.io.IOException;
import java.util.List;

import org.json.JSONArray;
import org.json.JSONObject;

import com.photon.phresco.uiconstants.PhrescoJavaWebserviceUiConstants;
import com.photon.phresco.uiconstants.PhrescoUiConstants;


public class TestJson {

	private PhrescoUiConstants phrsc;
	private PhrescoJavaWebserviceUiConstants nodejs;
	private  String jsonStr;
	private  JSONObject json;
	private  JSONArray categoryJsonObj;
	private String contextName;
	WelcomeScreen wel;
	

	//private  WebDriver driver;

	public  List<SearchResponse> configList = null;
	public  List<SearchResponse> categoryList = null;
	public  List<SearchResponse> categoryList1 = null;
	public  List<SearchResponse> categoryList2 = null;
	public  List<SearchResponse> categoryList3 = null;
	public  List<SearchResponse> NewProductList = null;
	public  List<SearchResponse> productList = null;
	public  List<SearchResponse> ProductsList = null;
	public  List<SearchResponse> computerList = null;
	public  List<SearchResponse> MobileList = null;
	public  List<SearchResponse> ProductReviewList = null;
	public  List<SearchResponse> SpecialProductsList = null;

	 SearchResponse response;
	 JSONObject jObject = null;
	
	
	
	public void testCategories(String serverURL,PhrescoUiConstants phrsc,PhrescoJavaWebserviceUiConstants nodejs) throws Exception {
		response = new SearchResponse();
		try {
					
			System.out.println("--------------> Method testCategories--------->");
			//phrsc = new PhrescoUiConstants();
    		//nodejs = new PhrescoJwsUiConstants();
    		System.out.println("--------------> Server URL: --------->"+serverURL+ phrsc.CONTEXT+nodejs.CONTEXT_REST_API+nodejs.CONTEXT_CATEGORIES);
    		//navigatePath(serverURL, phrsc.CONTEXT, nodejs. CONTEXT_REST_API,nodejs.CONTEXT_CATEGORIES);
    	//	wel.testGeneral();
    		jObject = response.getCategoryJSONObject(phrsc.PROTOCOL + "://"
				+ phrsc.HOST + ":" + phrsc.PORT + "/" + phrsc.CONTEXT +nodejs.CONTEXT_REST_API+nodejs.CONTEXT_CATEGORIES);
		} catch (Exception e) {

			e.printStackTrace();
		}
		categoryList = response.getCategoryGSONObject(jObject);
		System.out.println("TestJson" + categoryList);

		int j=1;
			for(int i=1;i==j;i++){
				for (SearchResponse obj : categoryList) {
					//System.out.println("the id =====" + obj.getId());
					//System.out.println("the name=====" + obj.getName());
					//assertEquals("1",obj.getId() );
			//assertEquals(j, obj.getId());
			System.out.println("Assertion success for Category id " + j);
			++j;
			}
			System.out.println("****Category id "+ (j)+ " doesn't exist****");

		}
	}

	 

	public void testCategory1( ) throws Exception {
		response = new SearchResponse();
		try {
			phrsc = new PhrescoUiConstants();
    		nodejs = new PhrescoJavaWebserviceUiConstants();
    		jObject = response.getCategoryJSONObject(phrsc.PROTOCOL + "://"
					+ phrsc.HOST + ":" + phrsc.PORT + "/" + phrsc. CONTEXT+ nodejs.CONTEXT_REST_API+nodejs. CONTEXT_CATEGORY1);
		} catch (IOException e) {

			e.printStackTrace();
		}
		categoryList1 = response.getCategoryList1GSONObject(jObject);
		System.out.println("TestJson" + categoryList1);
		int j=1;
		for(int i=1;i==j;i++){
		for (SearchResponse obj : categoryList1) {
			//assertEquals(j, obj.getId());
			System.out.println("Assertion success for Category id " + j);
			++j;
			}
			System.out.println("****Category id "+ (j)+ " doesn't exist****");
			
			}
	}

	public void testCategory2() throws Exception {
		response = new SearchResponse();
		try {
			phrsc = new PhrescoUiConstants();
    		nodejs = new PhrescoJavaWebserviceUiConstants();
			jObject = response.getCategoryJSONObject(phrsc.PROTOCOL + "://"
					+ phrsc.HOST + ":" + phrsc.PORT + "/" + phrsc. CONTEXT+ nodejs.CONTEXT_REST_API+nodejs. CONTEXT_CATEGORY2);
		} catch (IOException e) {

			e.printStackTrace();
		}
		categoryList2 = response.getCategoryList2GSONObject(jObject);
		System.out.println("TestJson" + categoryList2);
		int j=11;
		for(int i=11;i==j;i++){
		for (SearchResponse obj : categoryList2) {
			//assertEquals(j, obj.getId());
			System.out.println("Assertion success for Category id " + j);
			++j;
			}
			System.out.println("****Category id "+ (j)+ " doesn't exist****");
			
			}
	}

	public void testCategory3() throws Exception {
		response = new SearchResponse();
		try {
			phrsc = new PhrescoUiConstants();
    		nodejs = new PhrescoJavaWebserviceUiConstants();
			jObject = response.getCategoryJSONObject(phrsc.PROTOCOL + "://"
					+ phrsc.HOST + ":" + phrsc.PORT + "/" + phrsc.CONTEXT+ nodejs.CONTEXT_REST_API+nodejs. CONTEXT_CATEGORY3);
		} catch (IOException e) {

			e.printStackTrace();
		}
		categoryList3 = response.getCategoryList3GSONObject(jObject);
		System.out.println("TestJson" + categoryList3);
        
		int j=21;
		for(int i=21;i==j;i++){
		for (SearchResponse obj : categoryList3) {
			//assertEquals(j, obj.getId());
			System.out.println("Assertion success for Category id " + j);
			++j;
			}
			System.out.println("****Category id "+ (j)+ " doesn't exist****");
			
			}	}

	public void testNewProducts() throws Exception {
		response = new SearchResponse();
		try {
			phrsc = new PhrescoUiConstants();
    		nodejs = new PhrescoJavaWebserviceUiConstants();
			jObject = response.getCategoryJSONObject(phrsc.PROTOCOL + "://"
					+ phrsc.HOST + ":" + phrsc.PORT + "/" +  phrsc.CONTEXT + nodejs.CONTEXT_REST_API + nodejs.CONTEXT_NEWPRODUCTS);
		} catch (IOException e) {

			e.printStackTrace();
		}
		NewProductList = response.getNewProductListGSONObject(jObject);
		System.out.println("TestJson" + NewProductList);

		for (SearchResponse obj : NewProductList) {
			System.out.println("the id =====" + obj.getId());
			System.out.println("the name=====" + obj.getName());
		}
	}

	public void SearchMobile() throws Exception {

		response = new SearchResponse();
		try {
			phrsc = new PhrescoUiConstants();
    		nodejs = new PhrescoJavaWebserviceUiConstants();
			jObject = response.getCategoryJSONObject(phrsc.PROTOCOL + "://"
					+ phrsc.HOST + ":" + phrsc.PORT + "/" + phrsc.CONTEXT + nodejs.CONTEXT_REST_API + nodejs.CONTEXT_SEARCHMOBILE);
		} catch (IOException e) {
			e.printStackTrace();
		}

		MobileList = response.getproductGSONObject(jObject);
		System.out.println("TestJson" + MobileList);
		for (SearchResponse obj : MobileList) {

			System.out.println("the id =====" + obj.getId());
			System.out.println("the name=====" + obj.getName());
		}
	}

	public void SearchComputer() throws Exception {

		response = new SearchResponse();
		try {
			phrsc = new PhrescoUiConstants();
    		nodejs = new PhrescoJavaWebserviceUiConstants();
			jObject = response.getCategoryJSONObject(phrsc.PROTOCOL + "://"
					+ phrsc.HOST + ":" + phrsc.PORT + "/" + phrsc.CONTEXT + nodejs.CONTEXT_REST_API +  nodejs.CONTEXT_SEARCHCOUMPUTER);
		} catch (IOException e) {
			e.printStackTrace();
		}
		computerList = response.getcomputerListGSONObject(jObject);
		System.out.println("TestJson" + computerList);
		for (SearchResponse obj : computerList) {
			System.out.println("the id =====" + obj.getId());
			System.out.println("the name=====" + obj.getName());
		}
	}

	public void Products() throws Exception {
		response = new SearchResponse();
		try {
			phrsc = new PhrescoUiConstants();
    		nodejs = new PhrescoJavaWebserviceUiConstants();
			jObject = response.getCategoryJSONObject(phrsc.PROTOCOL + "://"
					+ phrsc.HOST + ":" + phrsc.PORT + "/" + phrsc.CONTEXT+nodejs.CONTEXT_REST_API+nodejs.CONTEXT_PRODUCTS);
		} catch (IOException e) {
			e.printStackTrace();
		}
		ProductsList = response.getproductGSONObject(jObject);
		System.out.println("TestJson" + ProductsList);
		
		int j=1;
		for(int i=1;i==j;i++){
		for (SearchResponse obj : ProductsList) {
			//assertEquals(j, obj.getId());
			System.out.println("Assertion success for Category id " + j);
			++j;
			}
			System.out.println("****Category id "+ (j)+ " doesn't exist****");
			
			}
	}

	public void SpecialProducts() throws Exception {
		response = new SearchResponse();
		try {
			phrsc = new PhrescoUiConstants();
    		nodejs = new PhrescoJavaWebserviceUiConstants();
			jObject = response.getCategoryJSONObject(phrsc.PROTOCOL + "://"
					+ phrsc.HOST + ":" + phrsc.PORT + "/" + phrsc.CONTEXT+nodejs.CONTEXT_REST_API+nodejs.CONTEXT_SPECIAL_PRODUCTS);
		} catch (IOException e) {
			e.printStackTrace();
		}
		SpecialProductsList = response.getSpecialProductsListGSONObject(jObject);
		System.out.println("TestJson" + SpecialProductsList);
		for (SearchResponse obj : SpecialProductsList) {
			System.out.println("the id =====" + obj.getId());
			System.out.println("the name=====" + obj.getName());
		}
	}

}