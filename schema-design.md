Table: Doctor
- id INT PRIMARY KEY
- name VARCHAR(100)
- specialty VARCHAR(50)

Table: Patient
- id INT PRIMARY KEY
- name VARCHAR(100)
- dob DATE

Table: Appointment
- id INT PRIMARY KEY
- doctor_id INT FOREIGN KEY REFERENCES Doctor(id)
- patient_id INT FOREIGN KEY REFERENCES Patient(id)
- appointment_time DATETIME

Table: Admin
- id INT PRIMARY KEY
- name VARCHAR(100)

