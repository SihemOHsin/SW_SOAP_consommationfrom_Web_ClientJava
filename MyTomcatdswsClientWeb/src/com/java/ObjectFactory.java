
package com.java;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.java package. 
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

    private final static QName _GetInfoEtudiant_QNAME = new QName("http://java.com/", "getInfoEtudiant");
    private final static QName _GetAllNoteMatiere_QNAME = new QName("http://java.com/", "getAllNoteMatiere");
    private final static QName _GetAllNotes_QNAME = new QName("http://java.com/", "getAllNotes");
    private final static QName _GetNoteEtudiant_QNAME = new QName("http://java.com/", "getNoteEtudiant");
    private final static QName _GetNoteEtudiantResponse_QNAME = new QName("http://java.com/", "getNoteEtudiantResponse");
    private final static QName _Note_QNAME = new QName("http://java.com/", "note");
    private final static QName _GetAllNoteMatiereResponse_QNAME = new QName("http://java.com/", "getAllNoteMatiereResponse");
    private final static QName _GetInfoEtudiantResponse_QNAME = new QName("http://java.com/", "getInfoEtudiantResponse");
    private final static QName _Candidat_QNAME = new QName("http://java.com/", "candidat");
    private final static QName _GetAllNotesResponse_QNAME = new QName("http://java.com/", "getAllNotesResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.java
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetInfoEtudiant }
     * 
     */
    public GetInfoEtudiant createGetInfoEtudiant() {
        return new GetInfoEtudiant();
    }

    /**
     * Create an instance of {@link GetAllNoteMatiere }
     * 
     */
    public GetAllNoteMatiere createGetAllNoteMatiere() {
        return new GetAllNoteMatiere();
    }

    /**
     * Create an instance of {@link GetAllNotes }
     * 
     */
    public GetAllNotes createGetAllNotes() {
        return new GetAllNotes();
    }

    /**
     * Create an instance of {@link GetNoteEtudiant }
     * 
     */
    public GetNoteEtudiant createGetNoteEtudiant() {
        return new GetNoteEtudiant();
    }

    /**
     * Create an instance of {@link GetNoteEtudiantResponse }
     * 
     */
    public GetNoteEtudiantResponse createGetNoteEtudiantResponse() {
        return new GetNoteEtudiantResponse();
    }

    /**
     * Create an instance of {@link Note }
     * 
     */
    public Note createNote() {
        return new Note();
    }

    /**
     * Create an instance of {@link GetInfoEtudiantResponse }
     * 
     */
    public GetInfoEtudiantResponse createGetInfoEtudiantResponse() {
        return new GetInfoEtudiantResponse();
    }

    /**
     * Create an instance of {@link Candidat }
     * 
     */
    public Candidat createCandidat() {
        return new Candidat();
    }

    /**
     * Create an instance of {@link GetAllNotesResponse }
     * 
     */
    public GetAllNotesResponse createGetAllNotesResponse() {
        return new GetAllNotesResponse();
    }

    /**
     * Create an instance of {@link GetAllNoteMatiereResponse }
     * 
     */
    public GetAllNoteMatiereResponse createGetAllNoteMatiereResponse() {
        return new GetAllNoteMatiereResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetInfoEtudiant }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://java.com/", name = "getInfoEtudiant")
    public JAXBElement<GetInfoEtudiant> createGetInfoEtudiant(GetInfoEtudiant value) {
        return new JAXBElement<GetInfoEtudiant>(_GetInfoEtudiant_QNAME, GetInfoEtudiant.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllNoteMatiere }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://java.com/", name = "getAllNoteMatiere")
    public JAXBElement<GetAllNoteMatiere> createGetAllNoteMatiere(GetAllNoteMatiere value) {
        return new JAXBElement<GetAllNoteMatiere>(_GetAllNoteMatiere_QNAME, GetAllNoteMatiere.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllNotes }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://java.com/", name = "getAllNotes")
    public JAXBElement<GetAllNotes> createGetAllNotes(GetAllNotes value) {
        return new JAXBElement<GetAllNotes>(_GetAllNotes_QNAME, GetAllNotes.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetNoteEtudiant }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://java.com/", name = "getNoteEtudiant")
    public JAXBElement<GetNoteEtudiant> createGetNoteEtudiant(GetNoteEtudiant value) {
        return new JAXBElement<GetNoteEtudiant>(_GetNoteEtudiant_QNAME, GetNoteEtudiant.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetNoteEtudiantResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://java.com/", name = "getNoteEtudiantResponse")
    public JAXBElement<GetNoteEtudiantResponse> createGetNoteEtudiantResponse(GetNoteEtudiantResponse value) {
        return new JAXBElement<GetNoteEtudiantResponse>(_GetNoteEtudiantResponse_QNAME, GetNoteEtudiantResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Note }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://java.com/", name = "note")
    public JAXBElement<Note> createNote(Note value) {
        return new JAXBElement<Note>(_Note_QNAME, Note.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllNoteMatiereResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://java.com/", name = "getAllNoteMatiereResponse")
    public JAXBElement<GetAllNoteMatiereResponse> createGetAllNoteMatiereResponse(GetAllNoteMatiereResponse value) {
        return new JAXBElement<GetAllNoteMatiereResponse>(_GetAllNoteMatiereResponse_QNAME, GetAllNoteMatiereResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetInfoEtudiantResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://java.com/", name = "getInfoEtudiantResponse")
    public JAXBElement<GetInfoEtudiantResponse> createGetInfoEtudiantResponse(GetInfoEtudiantResponse value) {
        return new JAXBElement<GetInfoEtudiantResponse>(_GetInfoEtudiantResponse_QNAME, GetInfoEtudiantResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Candidat }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://java.com/", name = "candidat")
    public JAXBElement<Candidat> createCandidat(Candidat value) {
        return new JAXBElement<Candidat>(_Candidat_QNAME, Candidat.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllNotesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://java.com/", name = "getAllNotesResponse")
    public JAXBElement<GetAllNotesResponse> createGetAllNotesResponse(GetAllNotesResponse value) {
        return new JAXBElement<GetAllNotesResponse>(_GetAllNotesResponse_QNAME, GetAllNotesResponse.class, null, value);
    }

}
