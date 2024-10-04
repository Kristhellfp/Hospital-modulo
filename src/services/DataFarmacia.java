package src.services;

import src.model.Medicina;

import java.time.LocalDate;
import java.util.ArrayList;

public class DataFarmacia {
    public static ArrayList<Medicina> listaMedicinas() {
        ArrayList<Medicina> medicinas = new ArrayList<>();
        medicinas.add(new Medicina("Dolorrelief", "Comprimidos", "500 mg cada 4-6 horas", "Paracetamol", LocalDate.of(2025, 5, 27), "B0015T3", 2.50, "Tratamiento de dolor leve a moderado, fiebre", "Hipersensibilidad al medicamento, enfermedad hepática severa"));
        medicinas.add(new Medicina("Antiinflamatorio Plus", "Tabletas", "200-400 mg cada 4-6 horas", "Ibuprofeno", LocalDate.of(2024, 1, 12), "A14234J", 4.00, "Alivio de dolor inflamatorio, fiebre, artritis", "Úlcera péptica activa, insuficiencia renal grave, asma inducida por AINEs"));
        medicinas.add(new Medicina("Aspiricina", "Cápsulas", "500 mg cada 8 horas", "Aspirina", LocalDate.of(2022, 6, 14), "C00928X", 8.00, "Infecciones bacterianas como otitis, bronquitis, infecciones de piel", "Alergia a penicilinas, mononucleosis infecciosa"));
        medicinas.add(new Medicina("Amoxitrat", "Cápsulas", "500 mg cada 8 horas", "Amoxicilina", LocalDate.of(2025, 8, 25), "C00928X", 8.00, "Infecciones bacterianas como otitis, bronquitis, infecciones de piel", "Alergia a penicilinas, mononucleosis infecciosa"));
        medicinas.add(new Medicina("Gastroprotect", "Cápsulas", "20 mg al día", "Omeprazol", LocalDate.of(2022, 7, 31), "D00712P", 3.00, "Tratamiento de úlceras gástricas, reflujo gastroesofágico", "Hipersensibilidad al medicamento, insuficiencia hepática grave"));
        medicinas.add(new Medicina("Diabest", "Comprimidos", "500-850 mg dos o tres veces al día", "Metformina", LocalDate.of(2026, 5, 30), "M0345X", 5.50, "Tratamiento de la diabetes tipo 2", "Insuficiencia renal grave, acidosis láctica, hipersensibilidad a metformina"));
        medicinas.add(new Medicina("CardioControl", "Tabletas", "50 mg una vez al día", "Losartán potásico", LocalDate.of(2025, 12, 04), "E00917M", 6.00, "Hipertensión arterial, insuficiencia cardíaca", "Hipersensibilidad al medicamento, embarazo"));
        medicinas.add(new Medicina("ColesterolPlus", "Comprimidos", "10-80 mg al día", "Atorvastatina cálcica", LocalDate.of(2026, 11, 02), "A01023L", 15.00, "Hipercolesterolemia, prevención de enfermedades cardiovasculares", "Enfermedad hepática activa, embarazo, lactancia"));
        medicinas.add(new Medicina("Simvastat", "Tabletas", "10-40 mg al día", "Simvastatina", LocalDate.of(2024, 5, 25), "S01145F", 12.00, "Reducción de colesterol LDL y triglicéridos", "Enfermedad hepática activa, embarazo, lactancia"));
        medicinas.add(new Medicina("Pressionex", "Tabletas", "5-20 mg al día", "Enalapril maleato", LocalDate.of(2024, 5, 25), "E01567R", 7.00, "Hipertensión arterial, insuficiencia cardíaca", "Hipersensibilidad a los inhibidores de la ECA, angioedema"));
        medicinas.add(new Medicina("Thyrofix", "Tabletas", "50-200 mcg al día", "Levotiroxina sódica", LocalDate.of(2024, 5, 25), "L00654Y", 4.00, "Hipotiroidismo", "Hipersensibilidad a levotiroxina, tirotoxicosis no tratada"));
        medicinas.add(new Medicina("AnxietyFree", "Tabletas", "0.5-2 mg al día", "Clonazepam", LocalDate.of(2024, 5, 25), "C00234P", 10.00, "Trastornos de ansiedad, convulsiones", "Insuficiencia hepática grave, glaucoma de ángulo cerrado"));
        medicinas.add(new Medicina("Furosemidex", "Tabletas", "20-40 mg al día", "Furosemida", LocalDate.of(2024, 5, 25), "F01924L", 3.00, "Insuficiencia cardíaca, edema", "Anuria, deshidratación, hipovolemia"));
        medicinas.add(new Medicina("HeartSafe", "Tabletas", "10-40 mg al día", "Lisinopril", LocalDate.of(2024, 5, 25), "L01234K", 6.50, "Hipertensión, insuficiencia cardíaca", "Angioedema, hipersensibilidad a inhibidores de la ECA"));
        medicinas.add(new Medicina("AllergiMed", "Tabletas", "10 mg al día", "Cetirizina", LocalDate.of(2024, 5, 25), "C00843Z", 5.00, "Rinitis alérgica, urticaria", "Hipersensibilidad a cetirizina, insuficiencia renal grave"));
        medicinas.add(new Medicina("Inflamaway", "Tabletas", "0.5-10 mg al día", "Dexametasona", LocalDate.of(2024, 5, 25), "D01543R", 7.00, "Alergias, inflamación", "Infecciones fúngicas sistémicas, hipersensibilidad"));
        medicinas.add(new Medicina("BacterialFix", "Tabletas", "500-750 mg cada 12 horas", "Ciprofloxacino", LocalDate.of(2024, 5, 25), "C02567D", 12.00, "Infecciones bacterianas", "Hipersensibilidad a quinolonas, embarazo, lactancia"));
        medicinas.add(new Medicina("Calmante", "Tabletas", "5-10 mg al día", "Diazepam", LocalDate.of(2024, 5, 25), "D00234L", 9.00, "Ansiedad, espasmos musculares", "Insuficiencia respiratoria, miastenia gravis"));
        medicinas.add(new Medicina("BacteriaClear", "Tabletas", "500 mg cada 24 horas", "Levofloxacino", LocalDate.of(2024, 5, 25), "L00734C", 15.00, "Infecciones bacterianas", "Hipersensibilidad a quinolonas, epilepsia"));
        medicinas.add(new Medicina("Inflammation Relief", "Tabletas", "5-60 mg al día", "Prednisona", LocalDate.of(2024, 5, 25), "P00943X", 8.50, "Enfermedades inflamatorias, alergias", "Infecciones fúngicas sistémicas, hipersensibilidad"));
        medicinas.add(new Medicina("GastroGuard", "Tabletas", "40 mg al día", "Pantoprazol", LocalDate.of(2024, 5, 25), "P01234V", 9.00, "Reflujo gastroesofágico, úlceras gástricas", "Hipersensibilidad al medicamento"));
        medicinas.add(new Medicina("GastroShield", "Tabletas", "20-40 mg al día", "Esomeprazol", LocalDate.of(2024, 5, 25), "E01012W", 10.00, "Úlceras gástricas, reflujo gastroesofágico", "Hipersensibilidad al medicamento"));
        medicinas.add(new Medicina("InfectionBlock", "Tabletas", "500 mg al día", "Azitromicina", LocalDate.of(2024, 5, 25), "A01234Q", 18.00, "Infecciones bacterianas", "Hipersensibilidad a macrólidos, insuficiencia hepática grave"));
        medicinas.add(new Medicina("CalmA", "Tabletas", "0.25-0.5 mg tres veces al día", "Alprazolam", LocalDate.of(2024, 5, 25), "C02345L", 9.00, "Trastornos de ansiedad, ataques de pánico", "Insuficiencia respiratoria grave, glaucoma de ángulo cerrado"));

        return medicinas;
    }
}
