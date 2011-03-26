/**
 * GetAllQuizzesReturn.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

/**
 * Modified for KSoap2 library by pp@patrickpollet.net
 */

package net.patrickpollet.moodlewsold.core;


import java.util.Arrays;
import java.util.List;
import net.patrickpollet.ksoap2.KSoap2Utils;
import net.patrickpollet.ksoap2.Soapeabilisable;
import org.ksoap2.serialization.SoapObject;

public class GetAllQuizzesReturn  extends SoapObject  implements Soapeabilisable{
    private net.patrickpollet.moodlewsold.core.QuizRecord[] quizzes;

    public GetAllQuizzesReturn(String nameSpace) {
        super(nameSpace,"GetAllQuizzesReturn");
    }

    /**
     * Get Custom Deserializer
     */
    public Soapeabilisable fromSoapResponse (SoapObject response) {
      GetAllQuizzesReturn ret = new GetAllQuizzesReturn(this.namespace);
      List _quizzes =KSoap2Utils.getList((SoapObject) response.getProperty("quizzes"),new QuizRecord(this.namespace));
      ret.setQuizzes((QuizRecord[]) _quizzes.toArray(new QuizRecord[0]));
      return ret;

    }


    /**
     * Gets the quizzes value for this GetAllQuizzesReturn.
     * 
     * @return quizzes
     */
    public net.patrickpollet.moodlewsold.core.QuizRecord[] getQuizzes() {
        return quizzes;
    }


    /**
     * Sets the quizzes value for this GetAllQuizzesReturn.
     * 
     * @param quizzes
     */
    public void setQuizzes(net.patrickpollet.moodlewsold.core.QuizRecord[] quizzes) {
        this.quizzes = quizzes;
       this.addProperty("quizzes",quizzes);
    }

}
