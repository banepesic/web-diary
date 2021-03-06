
package com.brolly.diary.service.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "findOne", namespace = "http://service.diary.brolly.com/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "findOne", namespace = "http://service.diary.brolly.com/")
public class FindOne {

    @XmlElement(name = "arg0", namespace = "")
    private Integer arg0;

    /**
     * 
     * @return
     *     returns Integer
     */
    public Integer getArg0() {
        return this.arg0;
    }

    /**
     * 
     * @param arg0
     *     the value for the arg0 property
     */
    public void setArg0(Integer arg0) {
        this.arg0 = arg0;
    }

}
