package com.sap.Service;

import com.pilogParts.ReferenceERP;
import com.pilogParts.ReferenceResponse;
import com.pilogProperties.PropertyResponse;
import com.sap.DataAccess.PiLogDataAccess;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by I318419 on 12/15/2016.
 */
@Service
public class MaterialService {
    String orgnId = "419530F565923E7EE053460AA9C04293";
    @Autowired
    private PiLogDataAccess materialData;

    public ReferenceResponse getParts(String partNumber, String className, String searchType){
        return materialData.getMaterial(partNumber ,className, searchType, orgnId);
    }
    public PropertyResponse getPropertiesByRecordNo(String recordNo)
    {
        return materialData.getProperties(recordNo,orgnId);
    }
    public PropertyResponse getPropertiesByPart(String partNumber, String className){
        //Making searchType as 'E' to get since part as result
        ReferenceResponse parts = materialData.getMaterial(partNumber, className, "E" , orgnId);
        List<ReferenceERP> details = parts.getDetails();
        ReferenceERP firstPart = details.get(0);
        return materialData.getProperties(firstPart.getRECORDNO(),orgnId);
    }
}
