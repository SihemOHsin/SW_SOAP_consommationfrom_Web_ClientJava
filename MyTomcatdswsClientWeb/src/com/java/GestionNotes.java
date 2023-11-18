
package com.java;

import java.util.List;
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
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "GestionNotes", targetNamespace = "http://java.com/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface GestionNotes {


    /**
     * 
     * @param nomMatiere
     * @return
     *     returns java.util.List<com.java.Note>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getAllNoteMatiere", targetNamespace = "http://java.com/", className = "com.java.GetAllNoteMatiere")
    @ResponseWrapper(localName = "getAllNoteMatiereResponse", targetNamespace = "http://java.com/", className = "com.java.GetAllNoteMatiereResponse")
    @Action(input = "http://java.com/GestionNotes/getAllNoteMatiereRequest", output = "http://java.com/GestionNotes/getAllNoteMatiereResponse")
    public List<Note> getAllNoteMatiere(
        @WebParam(name = "nomMatiere", targetNamespace = "")
        String nomMatiere);

    /**
     * 
     * @param nomMatiere
     * @param numInscription
     * @return
     *     returns com.java.Note
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getNoteEtudiant", targetNamespace = "http://java.com/", className = "com.java.GetNoteEtudiant")
    @ResponseWrapper(localName = "getNoteEtudiantResponse", targetNamespace = "http://java.com/", className = "com.java.GetNoteEtudiantResponse")
    @Action(input = "http://java.com/GestionNotes/getNoteEtudiantRequest", output = "http://java.com/GestionNotes/getNoteEtudiantResponse")
    public Note getNoteEtudiant(
        @WebParam(name = "numInscription", targetNamespace = "")
        String numInscription,
        @WebParam(name = "nomMatiere", targetNamespace = "")
        String nomMatiere);

    /**
     * 
     * @return
     *     returns java.util.List<com.java.Note>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getAllNotes", targetNamespace = "http://java.com/", className = "com.java.GetAllNotes")
    @ResponseWrapper(localName = "getAllNotesResponse", targetNamespace = "http://java.com/", className = "com.java.GetAllNotesResponse")
    @Action(input = "http://java.com/GestionNotes/getAllNotesRequest", output = "http://java.com/GestionNotes/getAllNotesResponse")
    public List<Note> getAllNotes();

    /**
     * 
     * @param numInscription
     * @return
     *     returns com.java.Candidat
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getInfoEtudiant", targetNamespace = "http://java.com/", className = "com.java.GetInfoEtudiant")
    @ResponseWrapper(localName = "getInfoEtudiantResponse", targetNamespace = "http://java.com/", className = "com.java.GetInfoEtudiantResponse")
    @Action(input = "http://java.com/GestionNotes/getInfoEtudiantRequest", output = "http://java.com/GestionNotes/getInfoEtudiantResponse")
    public Candidat getInfoEtudiant(
        @WebParam(name = "numInscription", targetNamespace = "")
        String numInscription);

}
