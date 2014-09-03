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
/*
 * ###
  * PHR_JavaWebService
 * %%
 * Copyright (C) 1999 - 2012 Photon Infotech Inc.
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * ###
 */
package com.photon.phresco.uiconstants;

import java.lang.reflect.Field;


public class PhrescoJavaWebserviceUiConstants {
	
	private ReadXMLFile readXml;

	
	//public String CONTEXT_ESHOP = "context";
	public String CONTEXT_REST_API="server.context.restapi";
	public String CONTEXT_CONFIG= "server.context.config";
	public String CONTEXT_CATEGORIES= "server.context.categories";
	public String CONTEXT_PRODUCTS= "server.context.products";
	public String CONTEXT_CATEGORY1= "server.context.category1";
	public String CONTEXT_CATEGORY2= "server.context.category2";
	public String CONTEXT_CATEGORY3= "server.context.category3";
	public String CONTEXT_PRODUCTREVIEW="server.context.productreview";
	public String CONTEXT_SEARCHMOBILE="server.context.searchmobile";
	public String CONTEXT_SEARCHCOUMPUTER="server.context.searchcomputer";
	public String CONTEXT_NEWPRODUCTS = "server.context.newproducts";
	public String CONTEXT_SPECIAL_PRODUCTS ="server.context.specialproducts";
	
	public String SPECIALPRODUCTS="stringCaptureSpecialProductsUrl";
	public String SEARCHMOBILE="stringCaptureSearchMobileUrl";
	public String SEARCHCOMPUTER="stringCaptureSearchComputerUrl";
	public String PRODUCTREVIEW="stringCaptureProductReviewUrl";
	public String ESHOP = "stringCaptureEshopUrl";
	public String CONFIG = "stringCaptureConfigUrl";
	public String CATEGORIES= "stringCaptureCategoriesUrl";
	public String PRODUCTS= "stringCaptureProductsUrl";
	public String CATEGORY1= "stringCaptureCategory1Url";
	public String CATEGORY2= "stringCaptureCategory2Url";
	public String CATEGORY3= "stringCaptureCategory3Url";
	
	

	

	public PhrescoJavaWebserviceUiConstants() {
		try {
		    readXml = new ReadXMLFile();
		    readXml.JwsData();
		    System.out.println("*********Reading Data from JavawebservicesData**********");
			Field[] arrayOfField1 = super.getClass().getFields();
			Field[] arrayOfField2 = arrayOfField1;
			int i = arrayOfField2.length;
			for (int j = 0; j < i; ++j) {
				Field localField = arrayOfField2[j];
				Object localObject = localField.get(this);
				if (localObject instanceof String)
					localField
							.set(this, readXml.getValue((String) localObject));

			}
		} catch (Exception localException) {
			throw new RuntimeException("Loading "
					+ super.getClass().getSimpleName() + " failed",
					localException);
		}
	}
}
