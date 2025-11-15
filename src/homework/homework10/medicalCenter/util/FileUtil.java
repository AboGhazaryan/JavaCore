package homework.homework10.medicalCenter.util;

import Library.storage.AuthorStorage;
import Library.storage.BookStorage;
import homework.homework10.medicalCenter.storage.DoctorStorage;
import homework.homework10.medicalCenter.storage.PatientStorage;

import java.io.*;

public class FileUtil {
    private static final String DOCTOR_DATA_FILE = "C:\\Users\\Admin\\IdeaProjects\\JavaCore\\src\\homework\\homework10\\medicalCenter\\data\\doctorData.data";
    private static final String PATIENT_DATA_FILE = "C:\\Users\\Admin\\IdeaProjects\\JavaCore\\src\\homework\\homework10\\medicalCenter\\data\\patientData.data";

    public static void serializeDoctorData(DoctorStorage doctorStorage){
        try(ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(DOCTOR_DATA_FILE))){
            outputStream.writeObject(doctorStorage);
        } catch (FileNotFoundException e) {
            System.out.println("File not found for doctor data" + e);
        } catch (IOException e) {
            System.out.println("Failed to serialize doctor data" + e);
        }
    }

    public static void serializePatientData(PatientStorage patientStorage){
        try(ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(PATIENT_DATA_FILE))){
            outputStream.writeObject(patientStorage);
        } catch (FileNotFoundException e) {
            System.out.println("File not found for patient data" + e);
        } catch (IOException e) {
            System.out.println("Failed to serialize patient data" + e);
        }
    }

    public static DoctorStorage deseralizeDoctorStorage(){
        try(ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(DOCTOR_DATA_FILE))){
            Object obj = objectInputStream.readObject();
            if(obj instanceof DoctorStorage doctorStorage){
                return doctorStorage;
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found for doctor data" + e);
        } catch (IOException e) {
            System.out.println("Failed to serialize doctor data" + e);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return new DoctorStorage();
    }

    public static PatientStorage deseralizePatientStorage(){
        try(ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(PATIENT_DATA_FILE))){
            Object obj = objectInputStream.readObject();
            if(obj instanceof PatientStorage patientStorage){
                return patientStorage;
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found for patient data" + e);
        } catch (IOException e) {
            System.out.println("Failed to serialize patient data" + e);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return new PatientStorage();
    }

}
