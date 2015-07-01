
package com.bt.service;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.4-b01
 * Generated source version: 2.2
 * 
 */
@WebService(name = "TariffService", targetNamespace = "http://service.bt.com/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface TariffService {


    /**
     * 
     * @param arg0
     * @return
     *     returns com.bt.service.TariffPlan
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getTariffPlan", targetNamespace = "http://service.bt.com/", className = "com.bt.service.GetTariffPlan")
    @ResponseWrapper(localName = "getTariffPlanResponse", targetNamespace = "http://service.bt.com/", className = "com.bt.service.GetTariffPlanResponse")
    @Action(input = "http://service.bt.com/TariffService/getTariffPlanRequest", output = "http://service.bt.com/TariffService/getTariffPlanResponse")
    public TariffPlan getTariffPlan(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0);

    /**
     * 
     * @param arg1
     * @param arg0
     * @return
     *     returns com.bt.service.TariffPlan
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getTariffPlanEconomy", targetNamespace = "http://service.bt.com/", className = "com.bt.service.GetTariffPlanEconomy")
    @ResponseWrapper(localName = "getTariffPlanEconomyResponse", targetNamespace = "http://service.bt.com/", className = "com.bt.service.GetTariffPlanEconomyResponse")
    @Action(input = "http://service.bt.com/TariffService/getTariffPlanEconomyRequest", output = "http://service.bt.com/TariffService/getTariffPlanEconomyResponse")
    public TariffPlan getTariffPlanEconomy(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        Float arg1);

    /**
     * 
     * @param arg1
     * @param arg0
     * @return
     *     returns com.bt.service.TariffPlan
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getTariffPlanLike", targetNamespace = "http://service.bt.com/", className = "com.bt.service.GetTariffPlanLike")
    @ResponseWrapper(localName = "getTariffPlanLikeResponse", targetNamespace = "http://service.bt.com/", className = "com.bt.service.GetTariffPlanLikeResponse")
    @Action(input = "http://service.bt.com/TariffService/getTariffPlanLikeRequest", output = "http://service.bt.com/TariffService/getTariffPlanLikeResponse")
    public TariffPlan getTariffPlanLike(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        TariffPlan arg1);

}
