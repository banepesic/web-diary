
package com.brolly.diary.service.jaxws;

import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "getAllDiaryEntriesResponse", namespace = "http://service.diary.brolly.com/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getAllDiaryEntriesResponse", namespace = "http://service.diary.brolly.com/")
public class GetAllDiaryEntriesResponse {

    @XmlElement(name = "return", namespace = "")
    private List<com.brolly.diary.domain.DiaryEntry> _return;

    /**
     * 
     * @return
     *     returns List<DiaryEntry>
     */
    public List<com.brolly.diary.domain.DiaryEntry> getReturn() {
        return this._return;
    }

    /**
     * 
     * @param _return
     *     the value for the _return property
     */
    public void setReturn(List<com.brolly.diary.domain.DiaryEntry> _return) {
        this._return = _return;
    }

}
