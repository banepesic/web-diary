
package com.brolly.diary.service.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "saveDiaryEntry", namespace = "http://service.diary.brolly.com/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "saveDiaryEntry", namespace = "http://service.diary.brolly.com/")
public class SaveDiaryEntry {

    @XmlElement(name = "arg0", namespace = "")
    private com.brolly.diary.domain.DiaryEntry arg0;

    /**
     * 
     * @return
     *     returns DiaryEntry
     */
    public com.brolly.diary.domain.DiaryEntry getArg0() {
        return this.arg0;
    }

    /**
     * 
     * @param arg0
     *     the value for the arg0 property
     */
    public void setArg0(com.brolly.diary.domain.DiaryEntry arg0) {
        this.arg0 = arg0;
    }

}
