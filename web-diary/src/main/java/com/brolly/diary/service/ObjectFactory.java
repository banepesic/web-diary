
package com.brolly.diary.service;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.brolly.diary.service package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _FindOne_QNAME = new QName("http://service.diary.brolly.com/", "findOne");
    private final static QName _GetAllDiaryEntries_QNAME = new QName("http://service.diary.brolly.com/", "getAllDiaryEntries");
    private final static QName _UpdateDiaryEntry_QNAME = new QName("http://service.diary.brolly.com/", "updateDiaryEntry");
    private final static QName _SayHelloResponse_QNAME = new QName("http://service.diary.brolly.com/", "sayHelloResponse");
    private final static QName _GetAllDiaryEntriesResponse_QNAME = new QName("http://service.diary.brolly.com/", "getAllDiaryEntriesResponse");
    private final static QName _SayHello_QNAME = new QName("http://service.diary.brolly.com/", "sayHello");
    private final static QName _DeleteDiaryEntryResponse_QNAME = new QName("http://service.diary.brolly.com/", "deleteDiaryEntryResponse");
    private final static QName _FindOneResponse_QNAME = new QName("http://service.diary.brolly.com/", "findOneResponse");
    private final static QName _SaveDiaryEntry_QNAME = new QName("http://service.diary.brolly.com/", "saveDiaryEntry");
    private final static QName _DiaryEntry_QNAME = new QName("http://service.diary.brolly.com/", "diaryEntry");
    private final static QName _UpdateDiaryEntryResponse_QNAME = new QName("http://service.diary.brolly.com/", "updateDiaryEntryResponse");
    private final static QName _DeleteDiaryEntry_QNAME = new QName("http://service.diary.brolly.com/", "deleteDiaryEntry");
    private final static QName _SaveDiaryEntryResponse_QNAME = new QName("http://service.diary.brolly.com/", "saveDiaryEntryResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.brolly.diary.service
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetAllDiaryEntriesResponse }
     * 
     */
    public GetAllDiaryEntriesResponse createGetAllDiaryEntriesResponse() {
        return new GetAllDiaryEntriesResponse();
    }

    /**
     * Create an instance of {@link SayHello }
     * 
     */
    public SayHello createSayHello() {
        return new SayHello();
    }

    /**
     * Create an instance of {@link DeleteDiaryEntryResponse }
     * 
     */
    public DeleteDiaryEntryResponse createDeleteDiaryEntryResponse() {
        return new DeleteDiaryEntryResponse();
    }

    /**
     * Create an instance of {@link FindOneResponse }
     * 
     */
    public FindOneResponse createFindOneResponse() {
        return new FindOneResponse();
    }

    /**
     * Create an instance of {@link SaveDiaryEntry }
     * 
     */
    public SaveDiaryEntry createSaveDiaryEntry() {
        return new SaveDiaryEntry();
    }

    /**
     * Create an instance of {@link FindOne }
     * 
     */
    public FindOne createFindOne() {
        return new FindOne();
    }

    /**
     * Create an instance of {@link GetAllDiaryEntries }
     * 
     */
    public GetAllDiaryEntries createGetAllDiaryEntries() {
        return new GetAllDiaryEntries();
    }

    /**
     * Create an instance of {@link UpdateDiaryEntry }
     * 
     */
    public UpdateDiaryEntry createUpdateDiaryEntry() {
        return new UpdateDiaryEntry();
    }

    /**
     * Create an instance of {@link SayHelloResponse }
     * 
     */
    public SayHelloResponse createSayHelloResponse() {
        return new SayHelloResponse();
    }

    /**
     * Create an instance of {@link UpdateDiaryEntryResponse }
     * 
     */
    public UpdateDiaryEntryResponse createUpdateDiaryEntryResponse() {
        return new UpdateDiaryEntryResponse();
    }

    /**
     * Create an instance of {@link DeleteDiaryEntry }
     * 
     */
    public DeleteDiaryEntry createDeleteDiaryEntry() {
        return new DeleteDiaryEntry();
    }

    /**
     * Create an instance of {@link SaveDiaryEntryResponse }
     * 
     */
    public SaveDiaryEntryResponse createSaveDiaryEntryResponse() {
        return new SaveDiaryEntryResponse();
    }

    /**
     * Create an instance of {@link DiaryEntry }
     * 
     */
    public DiaryEntry createDiaryEntry() {
        return new DiaryEntry();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindOne }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.diary.brolly.com/", name = "findOne")
    public JAXBElement<FindOne> createFindOne(FindOne value) {
        return new JAXBElement<FindOne>(_FindOne_QNAME, FindOne.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllDiaryEntries }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.diary.brolly.com/", name = "getAllDiaryEntries")
    public JAXBElement<GetAllDiaryEntries> createGetAllDiaryEntries(GetAllDiaryEntries value) {
        return new JAXBElement<GetAllDiaryEntries>(_GetAllDiaryEntries_QNAME, GetAllDiaryEntries.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateDiaryEntry }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.diary.brolly.com/", name = "updateDiaryEntry")
    public JAXBElement<UpdateDiaryEntry> createUpdateDiaryEntry(UpdateDiaryEntry value) {
        return new JAXBElement<UpdateDiaryEntry>(_UpdateDiaryEntry_QNAME, UpdateDiaryEntry.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SayHelloResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.diary.brolly.com/", name = "sayHelloResponse")
    public JAXBElement<SayHelloResponse> createSayHelloResponse(SayHelloResponse value) {
        return new JAXBElement<SayHelloResponse>(_SayHelloResponse_QNAME, SayHelloResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllDiaryEntriesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.diary.brolly.com/", name = "getAllDiaryEntriesResponse")
    public JAXBElement<GetAllDiaryEntriesResponse> createGetAllDiaryEntriesResponse(GetAllDiaryEntriesResponse value) {
        return new JAXBElement<GetAllDiaryEntriesResponse>(_GetAllDiaryEntriesResponse_QNAME, GetAllDiaryEntriesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SayHello }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.diary.brolly.com/", name = "sayHello")
    public JAXBElement<SayHello> createSayHello(SayHello value) {
        return new JAXBElement<SayHello>(_SayHello_QNAME, SayHello.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteDiaryEntryResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.diary.brolly.com/", name = "deleteDiaryEntryResponse")
    public JAXBElement<DeleteDiaryEntryResponse> createDeleteDiaryEntryResponse(DeleteDiaryEntryResponse value) {
        return new JAXBElement<DeleteDiaryEntryResponse>(_DeleteDiaryEntryResponse_QNAME, DeleteDiaryEntryResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindOneResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.diary.brolly.com/", name = "findOneResponse")
    public JAXBElement<FindOneResponse> createFindOneResponse(FindOneResponse value) {
        return new JAXBElement<FindOneResponse>(_FindOneResponse_QNAME, FindOneResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SaveDiaryEntry }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.diary.brolly.com/", name = "saveDiaryEntry")
    public JAXBElement<SaveDiaryEntry> createSaveDiaryEntry(SaveDiaryEntry value) {
        return new JAXBElement<SaveDiaryEntry>(_SaveDiaryEntry_QNAME, SaveDiaryEntry.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DiaryEntry }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.diary.brolly.com/", name = "diaryEntry")
    public JAXBElement<DiaryEntry> createDiaryEntry(DiaryEntry value) {
        return new JAXBElement<DiaryEntry>(_DiaryEntry_QNAME, DiaryEntry.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateDiaryEntryResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.diary.brolly.com/", name = "updateDiaryEntryResponse")
    public JAXBElement<UpdateDiaryEntryResponse> createUpdateDiaryEntryResponse(UpdateDiaryEntryResponse value) {
        return new JAXBElement<UpdateDiaryEntryResponse>(_UpdateDiaryEntryResponse_QNAME, UpdateDiaryEntryResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteDiaryEntry }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.diary.brolly.com/", name = "deleteDiaryEntry")
    public JAXBElement<DeleteDiaryEntry> createDeleteDiaryEntry(DeleteDiaryEntry value) {
        return new JAXBElement<DeleteDiaryEntry>(_DeleteDiaryEntry_QNAME, DeleteDiaryEntry.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SaveDiaryEntryResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.diary.brolly.com/", name = "saveDiaryEntryResponse")
    public JAXBElement<SaveDiaryEntryResponse> createSaveDiaryEntryResponse(SaveDiaryEntryResponse value) {
        return new JAXBElement<SaveDiaryEntryResponse>(_SaveDiaryEntryResponse_QNAME, SaveDiaryEntryResponse.class, null, value);
    }

}
