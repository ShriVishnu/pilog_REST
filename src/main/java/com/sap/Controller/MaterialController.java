package com.sap.Controller;

import com.pilogParts.ReferenceResponse;
import com.pilogProperties.PropertyResponse;
import com.sap.Service.MaterialService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


/**
 * Created by I318419 on 12/15/2016.
 */

@RestController
//@RequestMapping("/Parts")
public class MaterialController {
    @Autowired
    private MaterialService materialService;

    //All parameters as path variables
    @RequestMapping(value = "/Parts/{partNumber}/{className}/{searchType}" , method = RequestMethod.GET)
    public @ResponseBody ReferenceResponse getPartsByFilter(
            @PathVariable("partNumber") String partNumber,
            @PathVariable("className") String className,
            @PathVariable("searchType") String searchType)
    {
        return materialService.getParts(partNumber, className, searchType);
    }

    //Key parameters as path variables. Others as request param
    @RequestMapping(value = "/Parts/{partNumber}/{className}" , method = RequestMethod.GET)
    public @ResponseBody ReferenceResponse getPartsByFilter1(
            @PathVariable("partNumber") String partNumber,
            @PathVariable("className") String className,
            @RequestParam(value = "searchType" , required = false) String searchType)
    {
        return materialService.getParts(partNumber, className, searchType);
    }

    //All parameters as requestParam. To enable optional parameters
    @RequestMapping(value = "/Parts" , method = RequestMethod.GET)
    public @ResponseBody ReferenceResponse getPartsByQuery(
            @RequestParam(value = "partNumber", required = false) String partNumber,
            @RequestParam(value = "className", required = false) String className,
            @RequestParam(value = "searchType" , required = false) String searchType
    )
    {
        return materialService.getParts(partNumber, className, searchType);
    }

    //Properties by providing recordNo
    @RequestMapping(value = "/Properties/{recordNo}" , method = RequestMethod.GET)
    public @ResponseBody PropertyResponse getPropertiesByRecordNo(
            @PathVariable("recordNo") String recordNo
    ){
        return materialService.getPropertiesByRecordNo(recordNo);
    }

    //Properties by part. Made searchType as 'E' to get single part at a time
    @RequestMapping(value = "/Parts/{partNumber}/{className}/Properties" , method = RequestMethod.GET)
    public @ResponseBody PropertyResponse getPropertiesByPart(
            @PathVariable("partNumber") String partNumber,
            @PathVariable("className") String className
    )
    {
        return materialService.getPropertiesByPart(partNumber, className);
    }

}
