package JAXB;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URL;

public class XmlToBean {

    public static void main(String[] args) throws JAXBException, IOException {
        //	xml文件转java类
        JAXBContext context2 = JAXBContext.newInstance(StudentList.class);
        Unmarshaller unmarshaller = context2.createUnmarshaller();
        String xmlPath = "D:/testConfig.xml";
        File file = new File(xmlPath);
        StudentList studentList = (StudentList) unmarshaller.unmarshal(file);
        System.out.println(studentList.getStudents().get(0).getSex());

    }


}
