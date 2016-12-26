package com.sap.DataAccess;

import com.pilogParts.*;
import com.pilogProperties.PropertyResponse;
import com.pilogProperties.PropertyService;
import com.pilogProperties.PropertyService_Service;
import org.springframework.stereotype.Repository;

/**
 * Created by I318419 on 12/15/2016.
 */
@Repository
public class PiLogDataAccess {

    public ReferenceResponse getMaterial(String partNumber, String className, String searchType, String orgnId){
        Dictionary_002fReference ref = new Dictionary_002fReference();
        DictionaryReference port = ref.getDictionaryReferencePort();
        ReferenceRequest request = new ReferenceRequest();
        request.setCLASS(className);
        request.setPARTNUMBER(partNumber);
        request.setORGNID(orgnId);
        request.setSearchType(searchType);
        ReferenceResponse materialList = new ReferenceResponse();
        try {
            materialList = port.searchReference(request);
        } catch (Exception_Exception e) {
            e.printStackTrace();
        }

        return materialList;
    }

    public PropertyResponse getProperties(String recordNo, String orgnId){
        PropertyService_Service ref = new PropertyService_Service();
        PropertyService port = ref.getPropertyServicePort();
//        Search request = new Search();
//        request.setORGNID(orgnId);
//        request.setRecordNo(recordNo);
        PropertyResponse propertyList = new PropertyResponse();
        try {
            propertyList = port.search(recordNo,orgnId);
        } catch (com.pilogProperties.Exception_Exception e) {
            e.printStackTrace();
        }
        return propertyList;
    }
}
