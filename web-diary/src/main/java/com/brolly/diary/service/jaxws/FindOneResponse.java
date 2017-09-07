
package com.brolly.diary.service.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "findOneResponse", namespace = "http://service.diary.brolly.com/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "findOneResponse", namespace = "http://service.diary.brolly.com/")
public class FindOneResponse {

    @XmlElement(name = "return", namespace = "")
    private com.brolly.diary.domain.DiaryEntry _return;

    /**
     * 
     * @return
     *     returns DiaryEntry
     */
    public com.brolly.diary.domain.DiaryEntry getReturn() {
        return this._return;
    }

    /**
     * 
     * @param _return
     *     the value for the _return property
     */
    public void setReturn(com.brolly.diary.domain.DiaryEntry _return) {
        this._return = _return;
    }

}
