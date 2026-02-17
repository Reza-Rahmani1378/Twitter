1.1 Core Patient Information

Patient

Entity Overview: Central patient record containing comprehensive personal health information and demographic data.firstName

Description: Patient's legal first name

Data Source: Patient registration intake, Medical records transfer

Purpose of Collection: Patient identification, clinical care coordination, legal documentation

Usage Context: Primary identifier for clinical workflows, appointment scheduling, prescription verification

Contains PHI: Yes

lastName

Description: Patient's legal surname

Data Source: Patient registration intake, Medical records transfer

Purpose of Collection: Patient identification, clinical care coordination, legal documentation

Usage Context: Primary identifier for clinical workflows, appointment scheduling, prescription verification

Contains PHI: Yes

middleName

Description: Patient's middle name or initial

Data Source: Patient registration intake, Medical records transfer

Purpose of Collection: Complete patient identification to prevent medical errors

Usage Context: Secondary identifier to distinguish between patients with similar names

Contains PHI: Yes

dateOfBirth

Description: Patient's date of birth

Data Source: Patient registration intake, Government identification documents

Purpose of Collection: Patient verification, age-appropriate care protocols, medication dosing

Usage Context: Critical safety check for patient identification and clinical decision-making

Contains PHI: Yes

chartNumber

Description: Unique patient identifier assigned by the healthcare system

Data Source: System-generated upon patient registration

Purpose of Collection: Internal patient tracking and record linkage

Usage Context: Primary key for linking all clinical records to patient

Contains PHI: Yes

email

Description: Patient's primary email address

Data Source: Patient-provided during registration

Purpose of Collection: Patient communication, appointment reminders, test result notifications

Usage Context: Primary electronic communication channel with patient

Contains PHI: Yes

cellphone

Description: Patient's mobile telephone number

Data Source: Patient-provided during registration

Purpose of Collection: Urgent medical communications, appointment confirmations

Usage Context: Primary contact method for time-sensitive medical matters

Contains PHI: Yes

homePhone

Description: Patient's residential telephone number

Data Source: Patient-provided during registration

Purpose of Collection: Alternative patient contact method

Usage Context: Secondary communication channel when mobile unavailable

Contains PHI: Yes

officePhone

Description: Patient's workplace telephone number

Data Source: Patient-provided during registration

Purpose of Collection: Additional patient contact option during business hours

Usage Context: Alternative communication method for appointment scheduling

Contains PHI: Yes

contactFirstName

Description: First name of patient's emergency contact person

Data Source: Patient designation during intake

Purpose of Collection: Emergency medical situations requiring next-of-kin notification

Usage Context: Critical care scenarios when patient unable to make decisions

Contains PHI: Yes

contactLastName

Description: Surname of patient's emergency contact person

Data Source: Patient designation during intake

Purpose of Collection: Emergency medical situations requiring next-of-kin notification

Usage Context: Critical care scenarios when patient unable to make decisions

Contains PHI: Yes

contactPhone

Description: Telephone number for patient's emergency contact

Data Source: Patient-provided emergency contact information

Purpose of Collection: Emergency medical communications with patient's designated contact

Usage Context: Critical care situations requiring family notification

Contains PHI: Yes

contactRelation

Description: Relationship between patient and emergency contact person

Data Source: Patient designation during intake

Purpose of Collection: Understanding decision-making authority in emergency situations

Usage Context: Legal and ethical guidance for emergency medical decisions

Contains PHI: Yes

patientNote

Description: General clinical notes about patient care considerations

Data Source: Healthcare providers during patient encounters

Purpose of Collection: Important patient care information that affects clinical decisions

Usage Context: Clinical alerts, special care considerations, care team communications

Contains PHI: Yes

familyPhysician

Description: Patient's family doctor or general practitioner

Data Source: Patient designation or medical records transfer

Purpose of Collection: Comprehensive care coordination across healthcare providers

Usage Context: Referral communications, care plan coordination

Contains PHI: Yes

isDeceased

Description: Boolean indicator of patient's vital status

Data Source: Healthcare provider documentation, external death registry

Purpose of Collection: Prevent inappropriate medical interventions on deceased patients

Usage Context: Clinical safety measure, billing prevention, family communications

Contains PHI: Yes

deceasedDate

Description: Date of patient's death when applicable

Data Source: Healthcare provider documentation, death certificate information

Purpose of Collection: Legal documentation, family communications, record closure

Usage Context: Final medical record completion, family support services

Contains PHI: Yes

notification

Description: Patient notification preferences and contact permissions

Data Source: Patient consent during registration

Purpose of Collection: Respect patient communication preferences, consent management

Usage Context: Communication workflow, consent compliance, patient autonomy

Contains PHI: Yes

PatientInsurance

Entity Overview: Patient insurance coverage information and health card details for billing and coverage verification.healthCardNumber

Description: Provincial health insurance card number

Data Source: Patient-provided health card, government health records

Purpose of Collection: Healthcare coverage verification, billing authorization

Usage Context: Insurance claim processing, eligibility verification, public health reporting

Contains PHI: Yes

healthCardProvince

Description: Province or territory of health card issuance

Data Source: Patient-provided health card information

Purpose of Collection: Inter-provincial billing, coverage validation

Usage Context: Billing system routing, coverage determination, reciprocal billing

Contains PHI: Yes

healthCardExpiryDate

Description: Expiration date of health insurance card

Data Source: Patient-provided health card information

Purpose of Collection: Coverage validity verification, renewal tracking

Usage Context: Billing validation, patient notification for renewal

Contains PHI: Yes

versionCode

Description: Health card version or format identifier

Data Source: Provincial health card system

Purpose of Collection: Health card format validation, system compatibility

Usage Context: Card validation algorithms, billing system integration

Contains PHI: Yes

PatientAlternativeContact

Entity Overview: Additional contact persons designated by patients for communication and emergency purposes.firstName

Description: First name of alternative contact person

Data Source: Patient designation during registration

Purpose of Collection: Additional communication pathway, emergency contact options

Usage Context: Patient communication when primary contact unavailable

Contains PHI: Yes

lastName

Description: Last name of alternative contact person

Data Source: Patient designation during registration

Purpose of Collection: Complete identification of alternative contact

Usage Context: Emergency situations, family communication coordination

Contains PHI: Yes

residencePhone

Description: Home telephone number of alternative contact

Data Source: Patient-provided contact information

Purpose of Collection: Alternative communication channel for patient care

Usage Context: Family notification, emergency communications

Contains PHI: Yes

cellPhone

Description: Mobile telephone number of alternative contact

Data Source: Patient-provided contact information

Purpose of Collection: Primary contact method for alternative contact person

Usage Context: Urgent communications, emergency notifications

Contains PHI: Yes

email

Description: Email address of alternative contact person

Data Source: Patient-provided contact information

Purpose of Collection: Electronic communication with patient's designated contact

Usage Context: Non-urgent communications, appointment coordination

Contains PHI: Yes

note

Description: Special instructions regarding alternative contact

Data Source: Patient specification during registration

Purpose of Collection: Communication preferences, contact restrictions

Usage Context: Appropriate contact timing and methods

Contains PHI: Yes

PatientEnrollment

Entity Overview: Patient enrollment history documenting relationships with healthcare providers and enrollment status changes.enrollmentStatus

Description: Current enrollment status with healthcare provider

Data Source: Healthcare provider enrollment process

Purpose of Collection: Patient roster management, provider patient load tracking

Usage Context: Provider capacity planning, patient assignment, billing eligibility

Contains PHI: Yes

enrollmentStartDate

Description: Date when patient enrollment with provider began

Data Source: Provider enrollment documentation

Purpose of Collection: Enrollment timeline tracking, care continuity documentation

Usage Context: Provider patient history, enrollment duration calculation

Contains PHI: Yes

enrollmentTerminationDate

Description: Date when patient enrollment with provider ended

Data Source: Provider enrollment termination documentation

Purpose of Collection: Enrollment closure tracking, care transition documentation

Usage Context: Care transfer coordination, enrollment history maintenance

Contains PHI: Yes

MergedPatient

Entity Overview: Historical record of patient merges documenting consolidation of duplicate patient records.backupData

Description: Backup data from merged patient records

Data Source: Patient merge process, data consolidation

Purpose of Collection: Data integrity preservation, merge audit trail

Usage Context: Data recovery, merge verification, patient record integrity

Contains PHI: Yes

1.2 Clinical Encounters & Documentation

Encounter

Entity Overview: Comprehensive clinical visit documentation capturing all aspects of patient care during healthcare encounters.assessment

Description: Clinical assessment narrative documenting provider's evaluation of patient condition

Data Source: Healthcare provider clinical documentation

Purpose of Collection: Medical decision-making documentation, continuity of care

Usage Context: Clinical reasoning, treatment planning, legal medical record

Contains PHI: Yes

plan

Description: Treatment plan narrative outlining proposed medical interventions

Data Source: Healthcare provider clinical documentation

Purpose of Collection: Treatment planning, care coordination, clinical accountability

Usage Context: Treatment implementation, care team coordination, follow-up planning

Contains PHI: Yes

history

Description: Patient history narrative including presenting complaints and symptoms

Data Source: Patient interview, healthcare provider documentation

Purpose of Collection: Clinical diagnosis, treatment planning, medical decision-making

Usage Context: Diagnostic reasoning, clinical correlation, care continuity

Contains PHI: Yes

physicalExam

Description: Physical examination findings and observations

Data Source: Healthcare provider clinical examination

Purpose of Collection: Clinical diagnosis, treatment planning, medical documentation

Usage Context: Diagnostic correlation, treatment response monitoring, clinical assessment

Contains PHI: Yes

examinationNote

Description: Additional examination notes and clinical observations

Data Source: Healthcare provider clinical assessment

Purpose of Collection: Comprehensive clinical documentation, medical decision support

Usage Context: Clinical correlation, specialist referrals, treatment monitoring

Contains PHI: Yes

issueTitle

Description: Brief title summarizing the clinical encounter focus

Data Source: Healthcare provider encounter summary

Purpose of Collection: Quick clinical reference, encounter categorization

Usage Context: Clinical workflow, encounter tracking, care team communication

Contains PHI: Yes

concernField

Description: Primary clinical concern or chief complaint

Data Source: Patient report, healthcare provider assessment

Purpose of Collection: Clinical focus identification, diagnosis development

Usage Context: Clinical reasoning, treatment prioritization, care planning

Contains PHI: Yes

seenAt

Description: Date and time of clinical encounter

Data Source: System timestamp during encounter documentation

Purpose of Collection: Temporal tracking of medical care, billing documentation

Usage Context: Clinical timeline, billing verification, care coordination

Contains PHI: Yes

locked

Description: Boolean indicator that encounter documentation is finalized

Data Source: Healthcare provider workflow completion

Purpose of Collection: Clinical documentation integrity, billing completion

Usage Context: Documentation workflow, billing processing, audit compliance

Contains PHI: Yes

lockedAt

Description: Date and time when encounter was locked/finalized

Data Source: System timestamp during encounter finalization

Purpose of Collection: Documentation timeline tracking, audit trail

Usage Context: Clinical workflow monitoring, documentation integrity

Contains PHI: Yes

lockedBy

Description: Healthcare provider who finalized the encounter documentation

Data Source: Provider authentication during encounter finalization

Purpose of Collection: Clinical accountability, documentation responsibility

Usage Context: Legal documentation, clinical liability, audit trail

Contains PHI: Yes

EncounterNote

Entity Overview: Additional clinical notes supplementing encounter documentation with extended observations and comments.content

Description: Extended clinical note content and observations

Data Source: Healthcare provider documentation during or after encounter

Purpose of Collection: Comprehensive clinical documentation, additional clinical context

Usage Context: Clinical decision-making, care coordination, follow-up planning

Contains PHI: Yes

Signature

Entity Overview: Digital signatures for clinical documents providing authentication and approval tracking.signatureStatus

Description: Current status of digital signature

Data Source: Healthcare provider signature process

Purpose of Collection: Document authentication, approval tracking

Usage Context: Clinical document integrity, legal compliance, workflow completion

Contains PHI: Yes

target

Description: Type of clinical document being signed

Data Source: Document workflow system

Purpose of Collection: Signature context identification, workflow tracking

Usage Context: Document management, signature verification, clinical workflow

Contains PHI: Yes

targetId

Description: Specific identifier of document being signed

Data Source: Document management system

Purpose of Collection: Precise document identification, signature linkage

Usage Context: Document integrity, signature verification, audit trail

Contains PHI: Yes

1.3 Medications & Prescriptions

Prescription

Entity Overview: Medication prescription orders documenting prescribed treatments and pharmaceutical interventions.prescriptionStatus

Description: Current status of prescription in clinical workflow

Data Source: Healthcare provider action, pharmacy integration, system updates

Purpose of Collection: Prescription lifecycle tracking, medication management

Usage Context: Clinical workflow, pharmacy coordination, medication adherence monitoring

Contains PHI: Yes

prescriberName

Description: Name of healthcare provider who issued the prescription

Data Source: Healthcare provider identification during prescription creation

Purpose of Collection: Legal prescriber identification, clinical accountability

Usage Context: Regulatory compliance, prescription verification, clinical responsibility

Contains PHI: Yes

prescriberIdentifier

Description: Professional identifier of prescribing healthcare provider

Data Source: Healthcare provider professional license registration

Purpose of Collection: Regulatory compliance, prescription validation

Usage Context: Pharmacy verification, legal documentation, professional accountability

Contains PHI: Yes

prescriptionInstructions

Description: Detailed instructions for medication administration

Data Source: Healthcare provider clinical decision-making

Purpose of Collection: Safe medication use, patient education, clinical guidance

Usage Context: Patient medication compliance, pharmacy dispensing, clinical monitoring

Contains PHI: Yes

dispenseInterval

Description: Frequency and timing for medication dispensing

Data Source: Healthcare provider medication management decision

Purpose of Collection: Medication supply management, patient safety

Usage Context: Pharmacy dispensing schedule, medication adherence, clinical monitoring

Contains PHI: Yes

substitutionNotAllowed

Description: Indicator preventing generic medication substitution

Data Source: Healthcare provider clinical decision

Purpose of Collection: Specific medication requirement for clinical safety

Usage Context: Pharmacy dispensing requirements, medication safety

Contains PHI: Yes

reasonCode

Description: Clinical indication or diagnosis justifying prescription

Data Source: Healthcare provider clinical assessment

Purpose of Collection: Clinical justification, insurance authorization, medication appropriateness

Usage Context: Clinical decision support, insurance processing, medication review

Contains PHI: Yes

protocolIdentifier

Description: Clinical protocol or guideline reference for prescription

Data Source: Clinical decision support system, provider protocol selection

Purpose of Collection: Evidence-based prescribing, clinical protocol compliance

Usage Context: Clinical quality assurance, protocol adherence, medical decision support

Contains PHI: Yes

toBePickedUpWhen

Description: Timing instructions for patient prescription pickup

Data Source: Healthcare provider medication timing decision

Purpose of Collection: Medication timing optimization, patient convenience

Usage Context: Pharmacy workflow, patient scheduling, medication adherence

Contains PHI: Yes

Medication

Entity Overview: Individual medication entries documenting specific pharmaceutical treatments within prescriptions.startDate

Description: Date when medication therapy should commence

Data Source: Healthcare provider treatment planning

Purpose of Collection: Medication timing coordination, treatment schedule management

Usage Context: Patient medication schedule, clinical monitoring, adherence tracking

Contains PHI: Yes

endDate

Description: Date when medication therapy should conclude

Data Source: Healthcare provider treatment planning

Purpose of Collection: Medication duration management, treatment completion tracking

Usage Context: Patient medication schedule, prescription refill management, clinical review

Contains PHI: Yes

route

Description: Method of medication administration (oral, injection, topical, etc.)

Data Source: Healthcare provider clinical decision-making

Purpose of Collection: Safe medication administration, patient education

Usage Context: Patient instruction, nursing administration, medication safety

Contains PHI: Yes

form

Description: Physical form of medication (tablet, liquid, cream, etc.)

Data Source: Healthcare provider medication selection

Purpose of Collection: Medication identification, administration guidance

Usage Context: Patient education, pharmacy dispensing, medication adherence

Contains PHI: Yes

description

Description: Detailed medication description and clinical notes

Data Source: Healthcare provider medication documentation

Purpose of Collection: Medication clarification, clinical context, patient education

Usage Context: Patient understanding, pharmacy verification, clinical review

Contains PHI: Yes

notes

Description: Additional clinical notes regarding medication use

Data Source: Healthcare provider clinical observations

Purpose of Collection: Clinical monitoring, medication adjustments, patient education

Usage Context: Clinical decision-making, patient counseling, medication management

Contains PHI: Yes

longTermMedication

Description: Indicator for chronic or ongoing medication therapy

Data Source: Healthcare provider treatment planning

Purpose of Collection: Chronic disease management, medication refill authorization

Usage Context: Long-term care planning, prescription management, clinical monitoring

Contains PHI: Yes

patientCompliance

Description: Assessment of patient adherence to medication regimen

Data Source: Healthcare provider clinical assessment, patient reporting

Purpose of Collection: Medication effectiveness monitoring, treatment optimization

Usage Context: Clinical decision-making, medication adjustments, patient counseling

Contains PHI: Yes

source

Description: Origin of medication information (internal vs external records)

Data Source: System data entry workflow

Purpose of Collection: Data source tracking, information validation

Usage Context: Clinical decision support, medication reconciliation, data quality

Contains PHI: Yes

MedicationDose

Entity Overview: Detailed dosing information and administration schedules for prescribed medications.doseValue

Description: Numerical amount of medication dose

Data Source: Healthcare provider dosing calculation

Purpose of Collection: Precise medication administration, dosing safety

Usage Context: Patient medication administration, clinical monitoring, safety verification

Contains PHI: Yes

doseUnit

Description: Unit of measurement for medication dose

Data Source: Healthcare provider dosing specification

Purpose of Collection: Dosing precision, medication safety

Usage Context: Clinical accuracy, pharmacy verification, patient education

Contains PHI: Yes

frequency

Description: Frequency of medication administration

Data Source: Healthcare provider treatment planning

Purpose of Collection: Treatment schedule establishment, medication adherence

Usage Context: Patient dosing schedule, clinical monitoring, medication effectiveness

Contains PHI: Yes

durationAmount

Description: Duration amount for medication treatment

Data Source: Healthcare provider treatment planning

Purpose of Collection: Treatment duration specification, therapy completion

Usage Context: Treatment timeline, medication supply calculation, clinical monitoring

Contains PHI: Yes

durationUnit

Description: Time unit for treatment duration (days, weeks, months)

Data Source: Healthcare provider treatment planning

Purpose of Collection: Treatment duration precision, clinical planning

Usage Context: Treatment schedule, prescription refill timing, clinical review

Contains PHI: Yes

doseSequence

Description: Sequential order of dose administration in complex regimens

Data Source: Healthcare provider complex dosing protocol

Purpose of Collection: Complex medication regimen management, dosing accuracy

Usage Context: Multi-step medication administration, treatment protocols, patient safety

Contains PHI: Yes

PrescriptionPrintLog

Entity Overview: Audit trail for prescription printing activities documenting when and by whom prescriptions were printed.printedAt

Description: Date and time when prescription was printed

Data Source: System timestamp during prescription printing

Purpose of Collection: Prescription audit trail, regulatory compliance

Usage Context: Prescription tracking, audit compliance, security monitoring

Contains PHI: Yes

1.4 Allergies & Adverse Reactions

Allergy

Entity Overview: Patient allergy and adverse reaction documentation for clinical safety and treatment planning.allergyCategory

Description: Classification of allergy type (drug, food, environmental, etc.)

Data Source: Healthcare provider clinical assessment, patient report

Purpose of Collection: Clinical safety categorization, treatment planning

Usage Context: Medication safety checks, treatment contraindication screening

Contains PHI: Yes

title

Description: Name or description of specific allergen

Data Source: Patient report, healthcare provider documentation

Purpose of Collection: Allergen identification, clinical safety alerts

Usage Context: Medication prescribing safety, treatment planning, emergency care

Contains PHI: Yes

reactionType

Description: Classification of allergic reaction mechanism

Data Source: Healthcare provider clinical assessment

Purpose of Collection: Clinical severity assessment, treatment planning

Usage Context: Emergency preparedness, medication safety, clinical decision-making

Contains PHI: Yes

reaction

Description: Specific symptoms or manifestations of allergic reaction

Data Source: Patient report, healthcare provider observation

Purpose of Collection: Reaction severity assessment, treatment planning

Usage Context: Emergency response planning, medication safety, clinical monitoring

Contains PHI: Yes

severity

Description: Clinical severity level of allergic reaction

Data Source: Healthcare provider clinical assessment

Purpose of Collection: Clinical risk stratification, emergency planning

Usage Context: Treatment contraindication assessment, emergency preparedness

Contains PHI: Yes

startDate

Description: Date when allergy was first identified or occurred

Data Source: Patient report, healthcare provider documentation

Purpose of Collection: Allergy timeline documentation, clinical history

Usage Context: Clinical correlation, allergy progression monitoring

Contains PHI: Yes

description

Description: Additional clinical details about allergic condition

Data Source: Healthcare provider clinical documentation

Purpose of Collection: Comprehensive allergy documentation, clinical context

Usage Context: Clinical decision-making, patient education, care coordination

Contains PHI: Yes

notes

Description: Clinical notes regarding allergy management or considerations

Data Source: Healthcare provider clinical observations

Purpose of Collection: Clinical guidance, allergy management planning

Usage Context: Treatment planning, patient counseling, clinical alerts

Contains PHI: Yes

1.5 Vital Signs & Measurements

VitalRecord

Entity Overview: Individual vital sign measurements documenting patient physiological parameters during clinical encounters.value

Description: Numerical measurement value for the vital sign

Data Source: Medical device measurement, healthcare provider assessment

Purpose of Collection: Clinical monitoring, treatment response assessment

Usage Context: Clinical correlation, treatment adjustment, health trend analysis

Contains PHI: Yes

VitalRecordGroup

Entity Overview: Groups related vital sign measurements taken during the same clinical assessment session.measureDateTime

Description: Date and time when vital signs were measured

Data Source: Healthcare provider assessment, medical device timestamp

Purpose of Collection: Temporal correlation of vital sign measurements

Usage Context: Clinical timeline, trend analysis, treatment response monitoring

Contains PHI: Yes

1.6 Laboratory Results

LabOrder

Entity Overview: Laboratory test orders documenting requested diagnostic testing for patient evaluation.status

Description: Current status of laboratory order in workflow

Data Source: Laboratory information system, healthcare provider updates

Purpose of Collection: Order tracking, workflow management, result coordination

Usage Context: Laboratory workflow, result follow-up, clinical decision-making

Contains PHI: Yes

orderedAt

Description: Date and time when laboratory tests were ordered

Data Source: Healthcare provider order entry timestamp

Purpose of Collection: Order timeline tracking, clinical correlation

Usage Context: Clinical timeline, result interpretation, workflow management

Contains PHI: Yes

LabResult

Entity Overview: Laboratory test results documenting diagnostic testing outcomes and clinical findings.accessionNumber

Description: Unique laboratory identifier for test specimen

Data Source: Laboratory information system

Purpose of Collection: Test tracking, quality assurance, result correlation

Usage Context: Laboratory workflow, result verification, clinical correlation

Contains PHI: Yes

reviewer

Description: Healthcare provider who reviewed and interpreted results

Data Source: Healthcare provider clinical review process

Purpose of Collection: Clinical accountability, result interpretation documentation

Usage Context: Clinical decision-making, medical liability, patient care coordination

Contains PHI: Yes

status

Description: Current status of laboratory result in clinical workflow

Data Source: Healthcare provider review process, system workflow

Purpose of Collection: Clinical workflow management, result communication tracking

Usage Context: Patient notification, clinical action items, care coordination

Contains PHI: Yes

description

Description: Clinical description or summary of laboratory findings

Data Source: Healthcare provider interpretation, laboratory reporting

Purpose of Collection: Clinical communication, result interpretation

Usage Context: Patient communication, clinical decision-making, care coordination

Contains PHI: Yes

reviewedAt

Description: Date and time when results were clinically reviewed

Data Source: Healthcare provider review timestamp

Purpose of Collection: Clinical workflow tracking, timeliness monitoring

Usage Context: Quality assurance, clinical response time, patient safety

Contains PHI: Yes

receivedAt

Description: Date and time when results were received by healthcare system

Data Source: Laboratory information system integration timestamp

Purpose of Collection: Result timeliness tracking, workflow management

Usage Context: Clinical workflow, quality assurance, patient care timing

Contains PHI: Yes

collectedAt

Description: Date and time when specimen was collected from patient

Data Source: Laboratory specimen collection documentation

Purpose of Collection: Clinical correlation, result interpretation timing

Usage Context: Clinical timeline, result validity, diagnostic correlation

Contains PHI: Yes

ingestionSource

Description: Source system or method of laboratory result integration

Data Source: Laboratory information system integration

Purpose of Collection: Data quality tracking, integration monitoring

Usage Context: System integration, data validation, clinical correlation

Contains PHI: Yes

hasAbnormal

Description: Indicator for presence of abnormal test values requiring attention

Data Source: Clinical decision support system, healthcare provider review

Purpose of Collection: Clinical prioritization, abnormal finding identification

Usage Context: Clinical alerts, patient notification prioritization, care planning

Contains PHI: Yes

LabResultValue

Entity Overview: Individual laboratory test result values within comprehensive laboratory reports.value

Description: Numerical or categorical result value for specific laboratory test

Data Source: Laboratory analysis equipment, laboratory technician

Purpose of Collection: Clinical diagnosis, treatment monitoring, health assessment

Usage Context: Clinical decision-making, treatment response evaluation, health tracking

Contains PHI: Yes

abnormal

Description: Indicator whether result value falls outside normal reference range

Data Source: Laboratory reference range comparison, clinical interpretation

Purpose of Collection: Clinical attention prioritization, abnormal finding identification

Usage Context: Clinical alerts, treatment adjustments, diagnostic correlation

Contains PHI: Yes

unit

Description: Unit of measurement for laboratory test result

Data Source: Laboratory standard operating procedures

Purpose of Collection: Result interpretation accuracy, clinical correlation

Usage Context: Clinical assessment, result comparison, treatment monitoring

Contains PHI: Yes

IncomingLabResult

Entity Overview: External laboratory results received from outside laboratory facilities and systems.rawData

Description: Original unprocessed laboratory result data from external system

Data Source: External laboratory information systems

Purpose of Collection: Data integrity preservation, processing verification

Usage Context: System integration, data validation, clinical correlation

Contains PHI: Yes

processingStatus

Description: Status of external lab result processing and integration

Data Source: System data processing workflow

Purpose of Collection: Integration workflow tracking, error identification

Usage Context: System monitoring, data quality assurance, clinical availability

Contains PHI: Yes

externalId

Description: Identifier from external laboratory system

Data Source: External laboratory information system

Purpose of Collection: Cross-system correlation, duplicate prevention

Usage Context: System integration, data reconciliation, quality assurance

Contains PHI: Yes

IncomingLabResultValue

Entity Overview: Individual test values from external laboratory results requiring processing and integration.testCode

Description: External laboratory's test identification code

Data Source: External laboratory information system

Purpose of Collection: Test identification, result mapping, clinical correlation

Usage Context: System integration, test matching, clinical interpretation

Contains PHI: Yes

testName

Description: Name of laboratory test from external system

Data Source: External laboratory information system

Purpose of Collection: Test identification, clinical interpretation

Usage Context: Clinical correlation, result interpretation, system mapping

Contains PHI: Yes

value

Description: Test result value from external laboratory

Data Source: External laboratory analysis

Purpose of Collection: Clinical diagnosis, treatment monitoring

Usage Context: Clinical decision-making, treatment response evaluation

Contains PHI: Yes

unit

Description: Unit of measurement for external lab result

Data Source: External laboratory standard procedures

Purpose of Collection: Result interpretation accuracy, clinical correlation

Usage Context: Clinical assessment, result standardization

Contains PHI: Yes

abnormal

Description: Abnormal flag from external laboratory system

Data Source: External laboratory reference ranges

Purpose of Collection: Clinical attention prioritization, abnormal finding identification

Usage Context: Clinical alerts, treatment decisions, diagnostic correlation

Contains PHI: Yes

referenceRange

Description: Reference range provided by external laboratory

Data Source: External laboratory reference standards

Purpose of Collection: Result interpretation, clinical assessment

Usage Context: Clinical evaluation, abnormal value determination

Contains PHI: Yes

1.7 Immunizations & Injections

InjectionRecord

Entity Overview: Documentation of injections and immunizations administered to patients for disease prevention and treatment.recordType

Description: Classification of injection type (immunization vs therapeutic)

Data Source: Healthcare provider administration documentation

Purpose of Collection: Clinical categorization, immunization tracking

Usage Context: Immunization schedules, public health reporting, clinical planning

Contains PHI: Yes

drugIdentificationNumber

Description: Pharmaceutical identifier for administered substance

Data Source: Medication lot information, pharmacy systems

Purpose of Collection: Drug traceability, adverse event investigation

Usage Context: Safety monitoring, lot recall management





---



**drugIdentificationNumber (continued)**

**Usage Context:** Safety monitoring, lot recall management, adverse event tracking

**Contains PHI:** Yes



**doseValue**

**Description:** Numerical amount of administered dose

**Data Source:** Healthcare provider administration documentation

**Purpose of Collection:** Dosage accuracy documentation, clinical monitoring

**Usage Context:** Clinical correlation, booster scheduling, safety monitoring

**Contains PHI:** Yes



**doseUnit**

**Description:** Unit of measurement for administered dose

**Data Source:** Healthcare provider administration documentation

**Purpose of Collection:** Dosage precision, clinical accuracy

**Usage Context:** Clinical correlation, medication safety, dosage verification

**Contains PHI:** Yes



**injectedDatetime**

**Description:** Exact date and time of injection administration

**Data Source:** Healthcare provider administration timestamp

**Purpose of Collection:** Immunization timeline tracking, adverse event correlation

**Usage Context:** Booster scheduling, adverse event investigation, clinical timeline

**Contains PHI:** Yes



**refusedIndicator**

**Description:** Indicator that patient declined or refused injection

**Data Source:** Patient decision, healthcare provider documentation

**Purpose of Collection:** Patient autonomy documentation, clinical decision tracking

**Usage Context:** Informed consent, clinical liability, care planning

**Contains PHI:** Yes



**refusedDate**

**Description:** Date when patient refused recommended injection

**Data Source:** Patient decision documentation

**Purpose of Collection:** Patient autonomy timeline, clinical decision documentation

**Usage Context:** Clinical follow-up, patient counseling, care planning

**Contains PHI:** Yes



**notes**

**Description:** Clinical notes regarding injection administration

**Data Source:** Healthcare provider clinical observations

**Purpose of Collection:** Clinical context, adverse reaction monitoring

**Usage Context:** Safety monitoring, clinical follow-up, adverse event tracking

**Contains PHI:** Yes



**tradeName**

**Description:** Brand name of administered vaccine or medication

**Data Source:** Pharmaceutical product information

**Purpose of Collection:** Product identification, adverse event tracking

**Usage Context:** Safety monitoring, product recall management, clinical correlation

**Contains PHI:** Yes



**series**

**Description:** Series sequence number for multi-dose immunizations

**Data Source:** Immunization schedule tracking

**Purpose of Collection:** Immunization series completion tracking

**Usage Context:** Booster scheduling, immunization compliance, clinical monitoring

**Contains PHI:** Yes



**external**

**Description:** Indicator that injection was administered outside current healthcare system

**Data Source:** Patient report, external healthcare records

**Purpose of Collection:** Complete immunization history, duplicate prevention

**Usage Context:** Immunization schedule planning, clinical decision-making

**Contains PHI:** Yes



**historical**

**Description:** Indicator for historical immunization records from past care

**Data Source:** Medical history transfer, patient report

**Purpose of Collection:** Complete immunization timeline, clinical context

**Usage Context:** Booster scheduling, immunization gap identification

**Contains PHI:** Yes



**expirationDate**

**Description:** Expiration date of administered pharmaceutical product

**Data Source:** Pharmaceutical lot information

**Purpose of Collection:** Medication safety, efficacy assurance

**Usage Context:** Quality assurance, safety monitoring, clinical effectiveness

**Contains PHI:** Yes



**fundingSource**

**Description:** Funding source for immunization administration

**Data Source:** Public health program, insurance coverage

**Purpose of Collection:** Program tracking, cost reporting, eligibility verification

**Usage Context:** Public health reporting, program administration, billing coordination

**Contains PHI:** Yes



### 1.8 Medical History



#### OngoingHealthCondition

**Entity Overview:** Active health conditions and chronic diseases affecting patient care and treatment planning.



**dateOfOnset**

**Description:** Date when health condition first appeared or was diagnosed

**Data Source:** Patient report, healthcare provider assessment

**Purpose of Collection:** Disease timeline tracking, clinical correlation

**Usage Context:** Treatment planning, prognosis assessment, clinical monitoring

**Contains PHI:** Yes



**resolutionDate**

**Description:** Date when condition resolved or was cured

**Data Source:** Healthcare provider clinical assessment

**Purpose of Collection:** Treatment outcome tracking, clinical status updates

**Usage Context:** Clinical monitoring, treatment effectiveness, care planning

**Contains PHI:** Yes



**status**

**Description:** Current clinical status of health condition

**Data Source:** Healthcare provider clinical assessment

**Purpose of Collection:** Active condition tracking, treatment planning

**Usage Context:** Clinical decision-making, medication management, care coordination

**Contains PHI:** Yes



**problemDescription**

**Description:** Detailed description of health condition and clinical manifestations

**Data Source:** Healthcare provider clinical documentation

**Purpose of Collection:** Comprehensive condition documentation, clinical context

**Usage Context:** Clinical communication, treatment planning, care coordination

**Contains PHI:** Yes



**notes**

**Description:** Additional clinical notes regarding condition management

**Data Source:** Healthcare provider clinical observations

**Purpose of Collection:** Clinical guidance, treatment monitoring, care coordination

**Usage Context:** Treatment adjustment, clinical decision-making, patient education

**Contains PHI:** Yes



#### PastMedicalAndSurgicalHistory

**Entity Overview:** Historical medical conditions and surgical procedures from patient's medical history.



**dateOfOnset**

**Description:** Date when past medical condition first occurred

**Data Source:** Patient report, medical records transfer

**Purpose of Collection:** Medical history documentation, clinical context

**Usage Context:** Clinical decision-making, treatment planning, risk assessment

**Contains PHI:** Yes



**resolutionDate**

**Description:** Date when past condition was resolved or treated

**Data Source:** Patient report, medical records transfer

**Purpose of Collection:** Medical history completeness, clinical timeline

**Usage Context:** Clinical correlation, treatment planning, risk assessment

**Contains PHI:** Yes



**procedureDate**

**Description:** Date when surgical procedure was performed

**Data Source:** Surgical records, patient report

**Purpose of Collection:** Surgical history documentation, clinical planning

**Usage Context:** Treatment planning, surgical risk assessment, clinical correlation

**Contains PHI:** Yes



**notes**

**Description:** Additional clinical notes regarding past medical or surgical history

**Data Source:** Healthcare provider clinical documentation

**Purpose of Collection:** Clinical context, treatment planning guidance

**Usage Context:** Clinical decision-making, risk assessment, care planning

**Contains PHI:** Yes



**problemStatus**

**Description:** Status of past medical condition (resolved, ongoing, etc.)

**Data Source:** Healthcare provider clinical assessment

**Purpose of Collection:** Medical history accuracy, clinical relevance

**Usage Context:** Clinical decision-making, treatment contraindications, care planning

**Contains PHI:** Yes



#### FamilyMedicalHistory

**Entity Overview:** Family health history records documenting hereditary and familial health conditions.



**startDate**

**Description:** Date when family member's condition was first identified

**Data Source:** Patient report, family health information

**Purpose of Collection:** Genetic risk assessment, preventive care planning

**Usage Context:** Risk stratification, screening recommendations, genetic counseling

**Contains PHI:** Yes



**ageAtOnset**

**Description:** Age of family member when condition first appeared

**Data Source:** Patient report, family health records

**Purpose of Collection:** Genetic risk timeline, hereditary pattern assessment

**Usage Context:** Risk assessment, screening age determination, genetic counseling

**Contains PHI:** Yes



**treatment**

**Description:** Treatment received by family member for condition

**Data Source:** Patient report, family health information

**Purpose of Collection:** Treatment response patterns, therapeutic options assessment

**Usage Context:** Treatment planning, therapeutic effectiveness evaluation

**Contains PHI:** Yes



**relationship**

**Description:** Relationship between patient and affected family member

**Data Source:** Patient designation

**Purpose of Collection:** Genetic risk calculation, hereditary pattern assessment

**Usage Context:** Risk stratification, genetic counseling, screening recommendations

**Contains PHI:** Yes



**notes**

**Description:** Additional clinical notes regarding family medical history

**Data Source:** Patient report, healthcare provider documentation

**Purpose of Collection:** Clinical context, risk assessment enhancement

**Usage Context:** Genetic counseling, risk assessment, preventive care planning

**Contains PHI:** Yes



#### RiskFactor

**Entity Overview:** Health risk factors that may influence patient care planning and preventive interventions.



**riskFactorType**

**Description:** Category of health risk factor (lifestyle, genetic, environmental, etc.)

**Data Source:** Patient assessment, healthcare provider evaluation

**Purpose of Collection:** Risk stratification, preventive care planning

**Usage Context:** Clinical decision-making, screening recommendations, health promotion

**Contains PHI:** Yes



**exposureDetails**

**Description:** Specific details about risk factor exposure or characteristics

**Data Source:** Patient interview, healthcare provider assessment

**Purpose of Collection:** Risk quantification, intervention planning

**Usage Context:** Clinical risk assessment, preventive care recommendations

**Contains PHI:** Yes



**notes**

**Description:** Additional clinical notes regarding risk factor management

**Data Source:** Healthcare provider clinical observations

**Purpose of Collection:** Risk management planning, clinical guidance

**Usage Context:** Intervention planning, patient counseling, clinical decision-making

**Contains PHI:** Yes



**startDate**

**Description:** Date when risk factor exposure began

**Data Source:** Patient report, clinical assessment

**Purpose of Collection:** Risk timeline documentation, clinical correlation

**Usage Context:** Risk assessment, intervention timing, clinical monitoring

**Contains PHI:** Yes



**endDate**

**Description:** Date when risk factor exposure ended

**Data Source:** Patient report, clinical assessment

**Purpose of Collection:** Risk timeline completion, clinical status updates

**Usage Context:** Risk reassessment, clinical monitoring, intervention effectiveness

**Contains PHI:** Yes



**age**

**Description:** Patient age when risk factor was identified or began

**Data Source:** Patient assessment, clinical documentation

**Purpose of Collection:** Age-related risk correlation, developmental context

**Usage Context:** Risk assessment, preventive care timing, clinical correlation

**Contains PHI:** Yes



#### SpecialNeeds

**Entity Overview:** Special care needs and accommodations required for optimal patient care delivery.



**description**

**Description:** Detailed description of special care needs or accommodations

**Data Source:** Patient request, healthcare provider assessment

**Purpose of Collection:** Care customization, accommodation planning

**Usage Context:** Care delivery optimization, accessibility compliance, patient comfort

**Contains PHI:** Yes



**notes**

**Description:** Additional notes regarding special needs implementation

**Data Source:** Healthcare provider care planning

**Purpose of Collection:** Care coordination, implementation guidance

**Usage Context:** Care team communication, accommodation implementation

**Contains PHI:** Yes



**startDate**

**Description:** Date when special needs accommodation became necessary

**Data Source:** Patient assessment, healthcare provider evaluation

**Purpose of Collection:** Accommodation timeline tracking, care planning

**Usage Context:** Care coordination, accommodation scheduling

**Contains PHI:** Yes



**endDate**

**Description:** Date when special needs accommodation is no longer required

**Data Source:** Patient assessment, healthcare provider evaluation

**Purpose of Collection:** Accommodation duration tracking, resource planning

**Usage Context:** Care optimization, resource allocation

**Contains PHI:** Yes



### 1.9 Documents & Care Coordination



#### PatientDocument

**Entity Overview:** Patient-specific documents and forms associated with clinical care and administrative processes.



**description**

**Description:** Description of document content and purpose

**Data Source:** Healthcare provider documentation, patient submission

**Purpose of Collection:** Document categorization, clinical reference

**Usage Context:** Clinical decision-making, care coordination, legal documentation

**Contains PHI:** Yes



#### ReferralLetter

**Entity Overview:** Referral letters documenting patient referrals to specialists and other healthcare providers.



**referralContent**

**Description:** Clinical content and reason for referral

**Data Source:** Healthcare provider referral documentation

**Purpose of Collection:** Specialist communication, care coordination

**Usage Context:** Specialist consultation, care continuity, treatment planning

**Contains PHI:** Yes



**recipientProvider**

**Description:** Healthcare provider receiving the referral

**Data Source:** Healthcare provider referral decision

**Purpose of Collection:** Care coordination, specialist assignment

**Usage Context:** Referral routing, care team coordination, follow-up tracking

**Contains PHI:** Yes



**purpose**

**Description:** Clinical purpose and objectives of referral

**Data Source:** Healthcare provider clinical assessment

**Purpose of Collection:** Referral justification, care planning

**Usage Context:** Specialist preparation, treatment focus, clinical coordination

**Contains PHI:** Yes



**urgency**

**Description:** Priority level of referral request

**Data Source:** Healthcare provider clinical judgment

**Purpose of Collection:** Referral prioritization, scheduling coordination

**Usage Context:** Appointment scheduling, care urgency management

**Contains PHI:** Yes



#### CareElement

**Entity Overview:** Individual elements of preventive care and clinical interventions tracking for population health management.



**description**

**Description:** Description of care element and clinical intervention

**Data Source:** Clinical guidelines, healthcare provider planning

**Purpose of Collection:** Care planning documentation, intervention tracking

**Usage Context:** Preventive care management, quality reporting, care coordination

**Contains PHI:** Yes



**status**

**Description:** Current status of care element completion

**Data Source:** Healthcare provider workflow, clinical documentation

**Purpose of Collection:** Care completion tracking, quality monitoring

**Usage Context:** Care gap identification, quality reporting, patient outreach

**Contains PHI:** Yes



**startDate**

**Description:** Date when care element intervention began

**Data Source:** Healthcare provider clinical documentation

**Purpose of Collection:** Care timeline tracking, intervention monitoring

**Usage Context:** Care coordination, quality reporting, clinical monitoring

**Contains PHI:** Yes



**endDate**

**Description:** Date when care element intervention concluded

**Data Source:** Healthcare provider clinical documentation

**Purpose of Collection:** Care completion tracking, outcome monitoring

**Usage Context:** Quality reporting, care effectiveness assessment

**Contains PHI:** Yes



### 1.10 Audit & Population Health



#### ChartAuditAccessLog

**Entity Overview:** Comprehensive audit logging system documenting all access to patient charts and clinical records.



**occurredAt**

**Description:** Exact timestamp of chart access event

**Data Source:** System security monitoring

**Purpose of Collection:** Regulatory compliance, security monitoring, access tracking

**Usage Context:** PHIPA compliance, security investigations, access pattern analysis

**Contains PHI:** Yes



**identityString**

**Description:** Identity information of user accessing patient chart

**Data Source:** User authentication system

**Purpose of Collection:** Access accountability, security monitoring

**Usage Context:** Security investigations, compliance reporting, access verification

**Contains PHI:** Yes



**methodLabel**

**Description:** System method or function used to access chart data

**Data Source:** Application security monitoring

**Purpose of Collection:** Technical access tracking, system security

**Usage Context:** Security analysis, system optimization, compliance verification

**Contains PHI:** Yes



**resourceType**

**Description:** Type of clinical resource or data accessed

**Data Source:** Application security monitoring

**Purpose of Collection:** Detailed access tracking, data security monitoring

**Usage Context:** Security investigations, compliance reporting, access pattern analysis

**Contains PHI:** Yes



**resourceIds**

**Description:** Specific identifiers of clinical records accessed

**Data Source:** Application security monitoring

**Purpose of Collection:** Precise access tracking, security accountability

**Usage Context:** Security investigations, compliance audits, access verification

**Contains PHI:** Yes



**requestDetails**

**Description:** Technical details of chart access request

**Data Source:** Application security monitoring

**Purpose of Collection:** Comprehensive security logging, technical analysis

**Usage Context:** Security investigations, system analysis, compliance verification

**Contains PHI:** Yes



#### Cohort

**Entity Overview:** Patient population groupings for research, quality improvement, and population health management.



**name**

**Description:** Name identifier for patient cohort group

**Data Source:** Healthcare administration, research coordination

**Purpose of Collection:** Population management, research organization

**Usage Context:** Population health initiatives, research studies, quality improvement

**Contains PHI:** Yes



**description**

**Description:** Detailed description of cohort criteria and purpose

**Data Source:** Healthcare administration, research planning

**Purpose of Collection:** Cohort definition, research documentation

**Usage Context:** Population health management, research coordination, quality reporting

**Contains PHI:** Yes



**criteria**

**Description:** Specific criteria for patient inclusion in cohort

**Data Source:** Clinical research protocols, quality improvement planning

**Purpose of Collection:** Patient selection, cohort management

**Usage Context:** Population identification, research enrollment, quality initiatives

**Contains PHI:** Yes



#### CohortPatientLink

**Entity Overview:** Association records linking individual patients to specific cohort groups for research and population health management.



**enrollmentDate**

**Description:** Date when patient was enrolled in cohort

**Data Source:** Healthcare administration, research enrollment

**Purpose of Collection:** Cohort participation tracking, timeline documentation

**Usage Context:** Research timelines, population health tracking, enrollment management

**Contains PHI:** Yes



**status**

**Description:** Current enrollment status of patient in cohort

**Data Source:** Research coordination, healthcare administration

**Purpose of Collection:** Cohort participation management, enrollment tracking

**Usage Context:** Research management, population health initiatives, patient tracking

**Contains PHI:** Yes



#### RecallNotice

**Entity Overview:** Patient recall notifications for preventive care, follow-up appointments, and health maintenance.



**recallReason**

**Description:** Clinical reason for patient recall notification

**Data Source:** Clinical guidelines, healthcare provider assessment

**Purpose of Collection:** Preventive care coordination, follow-up management

**Usage Context:** Patient outreach, preventive care delivery, care gap closure

**Contains PHI:** Yes



**dueDate**

**Description:** Date when recall action or appointment is due

**Data Source:** Clinical guidelines, healthcare provider scheduling

**Purpose of Collection:** Recall timing coordination, preventive care scheduling

**Usage Context:** Patient scheduling, care delivery timing, preventive care management

**Contains PHI:** Yes



**status**

**Description:** Current status of recall notification and response

**Data Source:** Patient response, healthcare system tracking

**Purpose of Collection:** Recall completion tracking, outreach effectiveness

**Usage Context:** Care delivery monitoring, patient engagement tracking, quality improvement

**Contains PHI:** Yes



**notes**

**Description:** Additional notes regarding recall notification and patient response

**Data Source:** Healthcare provider documentation, patient communication

**Purpose of Collection:** Recall management, patient communication tracking

**Usage Context:** Care coordination, patient engagement, recall optimization

**Contains PHI:** Yes



#### AdministrativeNote

**Entity Overview:** Administrative notes related to patient care coordination and non-clinical patient management.



**noteContent**

**Description:** Content of administrative note regarding patient

**Data Source:** Healthcare administration, care coordination staff

**Purpose of Collection:** Administrative coordination, non-clinical patient management

**Usage Context:** Care coordination, administrative workflow, patient services

**Contains PHI:** Yes



**category**

**Description:** Category classification of administrative note

**Data Source:** Healthcare administration workflow

**Purpose of Collection:** Note organization, workflow management

**Usage Context:** Administrative efficiency, note retrieval, workflow optimization

**Contains PHI:** Yes



**priority**

**Description:** Priority level of administrative note

**Data Source:** Healthcare administration assessment

**Purpose of Collection:** Task prioritization, workflow management

**Usage Context:** Administrative efficiency, task management, care coordination

**Contains PHI:** Yes



#### Conversation

**Entity Overview:** AI-assisted clinical conversation records containing patient clinical context and documentation support.



**title**

**Description:** Title or subject of clinical conversation

**Data Source:** AI system, healthcare provider interaction

**Purpose of Collection:** Conversation organization, clinical context tracking

**Usage Context:** Clinical documentation support, care planning, provider assistance

**Contains PHI:** Yes



**summary**

**Description:** Summary of clinical conversation content

**Data Source:** AI system analysis, clinical interaction

**Purpose of Collection:** Clinical summary generation, documentation support

**Usage Context:** Clinical decision support, documentation efficiency, care coordination

**Contains PHI:** Yes



**editedAt**

**Description:** Timestamp of last conversation edit or modification

**Data Source:** System tracking of conversation updates

**Purpose of Collection:** Conversation version tracking, documentation timeline

**Usage Context:** Clinical documentation integrity, conversation management

**Contains PHI:** Yes



---



## 2. EMBEDDED FIELDS IN PATIENT CHART ENTITIES



### 2.1 InjectionAttributes (Embedded in InjectionRecord)



**attributes.name**

**Description:** Specific name of administered injection or immunization

**Data Source:** Healthcare provider documentation, immunization product information

**Purpose of Collection:** Precise injection identification, clinical record accuracy

**Usage Context:** Clinical correlation, adverse event tracking, immunization history

**Contains PHI:** Yes



**attributes.code**

**Description:** Standardized code for administered injection or immunization

**Data Source:** Immunization coding systems, pharmaceutical databases

**Purpose of Collection:** Standardized identification, public health reporting

**Usage Context:** Public health surveillance, immunization tracking, clinical decision support

**Contains PHI:** Yes



**attributes.manufacturer**

**Description:** Manufacturer name of administered injection or immunization product

**Data Source:** Pharmaceutical product labeling, lot information

**Purpose of Collection:** Product traceability, safety monitoring, adverse event investigation

**Usage Context:** Safety monitoring, product recalls, adverse event reporting

**Contains PHI:** Yes



**attributes.lotNumber**

**Description:** Lot number of administered injection or immunization product

**Data Source:** Pharmaceutical product lot information

**Purpose of Collection:** Product traceability, quality control, safety monitoring

**Usage Context:** Adverse event investigation, product recalls, quality assurance

**Contains PHI:** Yes



**attributes.route**

**Description:** Route of administration for injection or immunization

**Data Source:** Healthcare provider administration documentation

**Purpose of Collection:** Administration accuracy documentation, clinical correlation

**Usage Context:** Clinical assessment, administration verification, safety monitoring

**Contains PHI:** Yes



**attributes.site**

**Description:** Anatomical site where injection or immunization was administered

**Data Source:** Healthcare provider administration documentation

**Purpose of Collection:** Administration location documentation, adverse reaction correlation

**Usage Context:** Clinical assessment, adverse event investigation, administration tracking

**Contains PHI:** Yes



**attributes.type**

**Description:** Type classification of injection or immunization

**Data Source:** Healthcare provider clinical classification

**Purpose of Collection:** Clinical categorization, treatment classification

**Usage Context:** Clinical decision-making, treatment tracking, care planning

**Contains PHI:** Yes



**attributes.instruction**

**Description:** Specific administration instructions for injection or immunization

**Data Source:** Healthcare provider clinical instructions

**Purpose of Collection:** Administration guidance, clinical accuracy, patient safety

**Usage Context:** Administration protocols, clinical guidance, safety compliance

**Contains PHI:** Yes



### 2.2 ReferenceRange (Embedded in LabResultValue)



**referenceRange.low**

**Description:** Lower bound of normal reference range for laboratory test at time of result

**Data Source:** Laboratory reference standards, clinical guidelines

**Purpose of Collection:** Result interpretation context, abnormal value identification

**Usage Context:** Clinical assessment, result evaluation, treatment decision-making

**Contains PHI:** Yes



**referenceRange.high**

**Description:** Upper bound of normal reference range for laboratory test at time of result

**Data Source:** Laboratory reference standards, clinical guidelines

**Purpose of Collection:** Result interpretation context, abnormal value identification

**Usage Context:** Clinical assessment, result evaluation, treatment decision-making

**Contains PHI:** Yes



### 2.3 CohortPatientLink.Id (Embedded ID)



**id.patientId**

**Description:** Patient identifier linking to specific patient record

**Data Source:** Patient record system identification

**Purpose of Collection:** Patient-cohort association, research enrollment tracking

**Usage Context:** Research participant identification, population health management

**Contains PHI:** Yes



**id.cohortId**

**Description:** Cohort identifier for research or population health group

**Data Source:** Research protocol administration, population health programs

**Purpose of Collection:** Cohort identification, research organization

**Usage Context:** Research management, population health tracking

**Contains PHI:** Yes



---



## 3. INHERITED AUDIT AND PROVENANCE FIELDS



### 3.1 BaseChartModel Inheritance (All Patient Chart Entities)



**patient** *(Inherited from BaseChartModel)*

**Description:** Direct reference link to patient record for all clinical data

**Data Source:** Patient registration system, clinical workflow

**Purpose of Collection:** Clinical data organization, patient record association, care coordination

**Usage Context:** Clinical data retrieval, care continuity, patient record management

**Contains PHI:** Yes



**provider** *(Inherited from BaseChartModel)*

**Description:** Healthcare provider responsible for or associated with the clinical record

**Data Source:** Provider assignment, clinical workflow, encounter documentation

**Purpose of Collection:** Clinical accountability, provider-patient relationship tracking, care coordination

**Usage Context:** Clinical responsibility, care team coordination, provider workflow

**Contains PHI:** Yes



### 3.2 Auditable Inheritance (All Patient Chart Entities)



**createdBy** *(Inherited from Auditable)*

**Description:** Identifier of healthcare provider or system user who created the clinical record

**Data Source:** User authentication system, provider identification

**Purpose of Collection:** Clinical accountability, regulatory audit compliance, data provenance tracking

**Usage Context:** Privacy audit trails, access accountability, regulatory compliance (PHIPA/PIPEDA)

**Contains PHI:** No *(contains provider/user identifiers, not patient data)*



**updatedBy** *(Inherited from Auditable)*

**Description:** Identifier of healthcare provider or system user who last modified the clinical record

**Data Source:** User authentication system, provider identification

**Purpose of Collection:** Clinical accountability, change tracking, data integrity verification

**Usage Context:** Privacy audit trails, clinical accountability, regulatory compliance

**Contains PHI:** No *(contains provider/user identifiers, not patient data)*



**createdAt** *(Inherited from Auditable)*

**Description:** Timestamp when clinical record was initially created

**Data Source:** System timestamp during record creation

**Purpose of Collection:** Temporal audit trail, regulatory compliance, data timeline tracking

**Usage Context:** Clinical timeline, audit compliance, privacy investigation support

**Contains PHI:** No *(temporal metadata only)*



**updatedAt** *(Inherited from Auditable)*

**Description:** Timestamp when clinical record was last modified

**Data Source:** System timestamp during record modification

**Purpose of Collection:** Change tracking, audit trail maintenance, data integrity verification

**Usage Context:** Clinical documentation integrity, audit compliance, change investigation

**Contains PHI:** No *(temporal metadata only)*



### 3.3 CustomizableSettingsEntity Inheritance



**organization** *(VitalReferenceRangeRule)*

**Description:** Healthcare organization context for vital sign reference ranges

**Data Source:** Organizational configuration, multi-tenant system architecture

**Purpose of Collection:** Data segmentation, organizational policy implementation

**Usage Context:** Patient data access control, organizational boundaries

**Contains PHI:** No *(organizational context only)*



**patient** *(VitalReferenceRangeRule)*

**Description:** Patient-specific vital sign reference range customizations

**Data Source:** Clinical assessment, patient-specific medical conditions

**Purpose of Collection:** Personalized clinical decision support, individualized care

**Usage Context:** Patient-specific clinical alerts, customized care protocols

**Contains PHI:** Yes *(patient-specific clinical parameters)*



### 3.4 BaseMessage Inheritance (Clinical Communications)



**content** *(Message, ScheduledMessage)*

**Description:** Message content in healthcare team communications

**Data Source:** Healthcare provider clinical communications

**Purpose of Collection:** Clinical care coordination, team communication

**Usage Context:** Care team collaboration, clinical decision-making support

**Contains PHI:** Yes *(may contain patient identifiers and clinical information)*



**sender** *(Message, ScheduledMessage)*

**Description:** Healthcare provider or user who sent clinical communication

**Data Source:** User authentication, provider identification

**Purpose of Collection:** Communication accountability, clinical responsibility tracking

**Usage Context:** Clinical communication audit, care team coordination

**Contains PHI:** No *(provider identification only)*



**sentAt** *(Message, ScheduledMessage)*

**Description:** Timestamp of clinical communication

**Data Source:** System timestamp during message sending

**Purpose of Collection:** Communication timeline, audit trail maintenance

**Usage Context:** Clinical communication tracking, audit compliance

**Contains PHI:** No *(temporal metadata only)*



---



## 4. SYSTEM / ADMINISTRATIVE ENTITIES



### 4.1 User Management



#### User

**Entity Overview:** System user accounts for healthcare personnel and administrative staff accessing the healthcare system.

**Data Owner/Data Source:** Healthcare organization IT administration, Human resources department

**Purpose of Entity:** User authentication, system access control, audit trail maintenance for healthcare system access

**PHI Reference:** Indirectly references PHI through user actions and system access patterns. Does not directly contain PHI but enables PHI access through role-based permissions.



#### ProviderUser

**Entity Overview:** Healthcare provider-specific user accounts containing professional credentials and clinical practice information.

**Data Owner/Data Source:** Healthcare organization credentialing department, Professional licensing bodies, Provider services administration

**Purpose of Entity:** Professional credential verification, clinical workflow assignment, billing and regulatory compliance for healthcare providers

**PHI Reference:** Directly enables PHI access through clinical roles. Contains professional identifiers that may be included in clinical documentation but does not directly store PHI.



#### Role

**Entity Overview:** Role-based access control definitions for healthcare system permissions and clinical workflow authorization.

**Data Owner/Data Source:** Healthcare system security administration, Clinical operations management

**Purpose of Entity:** Access control enforcement, permission management, regulatory compliance for healthcare data access

**PHI Reference:** Indirectly references PHI by controlling access permissions. Enables or restricts PHI access based on role assignments.



#### Authority

**Entity Overview:** Individual system permissions and access rights that can be assigned to user roles.

**Data Owner/Data Source:** Healthcare system security administration, Application development

**Purpose of Entity:** Granular permission control, system security enforcement, regulatory compliance

**PHI Reference:** Indirectly references PHI by defining specific access permissions to clinical data and functions.



#### RoleAuthorityLink

**Entity Overview:** Association records linking user roles to their specific system permissions and authorities.

**Data Owner/Data Source:** Healthcare system security administration

**Purpose of Entity:** Role permission assignment, access control configuration, security policy enforcement

**PHI Reference:** Indirectly references PHI by determining which permissions enable access to clinical data.



#### UserRoleOrganization

**Entity Overview:** User role assignments within specific organizational contexts for multi-tenant system architecture.

**Data Owner/Data Source:** Healthcare organization administration, Human resources management

**Purpose of Entity:** Multi-tenant access control, organizational user management, role assignment tracking

**PHI Reference:** Indirectly references PHI by controlling organizational access to patient data within multi-tenant architecture.



#### AuthorityGroup

**Entity Overview:** Logical groupings of related system permissions for simplified role management and security administration.

**Data Owner/Data Source:** Healthcare system security administration

**Purpose of Entity:** Permission organization, role management simplification, security policy structure

**PHI Reference:** Indirectly references PHI by organizing permissions that control access to clinical data.



### 4.2 Organization Management



#### Organization

**Entity Overview:** Healthcare organization and facility management entities for multi-tenant system architecture.

**Data Owner/Data Source:** Healthcare system administration, Organizational management

**Purpose of Entity:** Multi-tenant system architecture, organizational context for all clinical and administrative operations

**PHI Reference:** Indirectly references PHI by providing organizational context for all patient records. Enables data segmentation and access control for PHI.



#### Location

**Entity Overview:** Healthcare facility locations and service delivery sites within organizations.

**Data Owner/Data Source:** Healthcare organization administration, Facilities management

**Purpose of Entity:** Facility management, service location tracking, appointment scheduling context

**PHI Reference:** Indirectly references PHI by providing location context for clinical encounters and appointments.



#### ProviderUserOrganization

**Entity Overview:** Association records linking healthcare providers to their affiliated organizations and facilities.

**Data Owner/Data Source:** Healthcare organization administration, Provider credentialing

**Purpose of Entity:** Provider affiliation tracking, organizational assignment, credentialing management

**PHI Reference:** Indirectly references PHI by determining provider access to organizational patient populations.



### 4.3 Appointment & Scheduling System



#### Appointment

**Entity Overview:** Patient appointment scheduling and management system for healthcare service delivery.

**Data Owner/Data Source:** Healthcare scheduling staff, Patient self-scheduling systems, Provider schedule management

**Purpose of Entity:** Healthcare service scheduling, resource allocation, patient access management

**PHI Reference:** Directly references PHI through patient linkage and clinical service information. Contains patient identifiers and health service details.



#### AppointmentStatus

**Entity Overview:** Standardized status definitions for appointment lifecycle management.

**Data Owner/Data Source:** Healthcare system configuration, Clinical operations management

**Purpose of Entity:** Appointment workflow standardization, status tracking, operational reporting

**PHI Reference:** None - Contains only status definitions without patient-specific information.



#### AppointmentTag

**Entity Overview:** Classification tags for appointment categorization and workflow organization.

**Data Owner/Data Source:** Healthcare system configuration, Clinical operations management

**Purpose of Entity:** Appointment categorization, workflow optimization, resource allocation

**PHI Reference:** None - Contains only categorical tags without patient-specific information.



#### PatientTag

**Entity Overview:** Classification tags for patient categorization and population management.

**Data Owner/Data Source:** Healthcare system configuration, Clinical operations management

**Purpose of Entity:** Patient categorization, population health management, workflow organization

**PHI Reference:** None - Contains only categorical tags without patient-specific information.



#### PresentingIssue

**Entity Overview:** Standardized presenting complaint templates for clinical documentation and appointment scheduling.

**Data Owner/Data Source:** Clinical operations management, Healthcare system configuration

**Purpose of Entity:** Clinical documentation standardization, appointment preparation, workflow efficiency

**PHI Reference:** None - Contains only standardized issue templates without patient-specific information.



#### ServiceType

**Entity Overview:** Healthcare service type definitions for appointment scheduling and resource management.

**Data Owner/Data Source:** Healthcare operations management, Clinical service administration

**Purpose of Entity:** Service categorization, scheduling optimization, resource allocation

**PHI Reference:** None - Contains only service type definitions without patient-specific information.



#### WorkTime

**Entity Overview:** Provider work schedule definitions for appointment scheduling and resource management.

**Data Owner/Data Source:** Provider schedule management, Healthcare operations administration

**Purpose of Entity:** Provider schedule management, appointment availability, resource planning

**PHI Reference:** None - Contains only schedule information without patient-specific data.



#### Reminder

**Entity Overview:** Appointment reminder system configuration and delivery tracking.

**Data Owner/Data Source:** Healthcare system configuration, Patient communication systems

**Purpose of Entity:** Patient communication automation, appointment adherence, no-show reduction

**PHI Reference:** Indirectly references PHI through patient communication and appointment linkage.



### 4.4 Reference Data & Clinical Support



#### Drug

**Entity Overview:** Pharmaceutical reference database containing medication information for prescribing and clinical decision support.

**Data Owner/Data Source:** Pharmaceutical databases, Health Canada drug product database, Clinical information systems

**Purpose of Entity:** Medication prescribing support, clinical decision making, drug interaction checking

**PHI Reference:** None - Contains only pharmaceutical reference data without patient-specific information.



#### GenericDrug

**Entity Overview:** Generic medication information database for prescribing alternatives and cost optimization.

**Data Owner/Data Source:** Pharmaceutical databases, Generic drug manufacturers, Clinical information systems

**Purpose of Entity:** Generic prescribing support, cost optimization, therapeutic equivalence

**PHI Reference:** None - Contains only generic drug reference data without patient-specific information.



#### Parametric

**Entity Overview:** System configuration parameters and lookup values for application functionality.

**Data Owner/Data Source:** Healthcare system configuration, Application administration

**Purpose of Entity:** System configuration management, lookup value standardization, application functionality

**PHI Reference:** None - Contains only system configuration data without patient-specific information.



#### Diagnosis

**Entity Overview:** Standardized diagnosis code reference database for clinical documentation and billing.

**Data Owner/Data Source:** International Classification of Diseases (ICD), Clinical coding standards organizations

**Purpose of Entity:** Clinical documentation standardization, billing accuracy, statistical reporting

**PHI Reference:** None - Contains only standardized diagnosis codes without patient-specific information.



### 4.5 Vital Signs System



#### VitalType

**Entity Overview:** Vital sign type definitions and normal range specifications for clinical monitoring.

**Data Owner/Data Source:** Clinical guidelines, Medical device standards, Healthcare system configuration

**Purpose of Entity:** Vital sign standardization, normal range reference, clinical decision support

**PHI Reference:** None - Contains only vital sign type definitions without patient-specific measurements.



#### VitalTypeCalculatedFromLink

**Entity Overview:** Configuration for calculated vital signs derived from other measured vital signs.

**Data Owner/Data Source:** Clinical guidelines, Healthcare system configuration

**Purpose of Entity:** Automated vital sign calculation, clinical efficiency, comprehensive monitoring

**PHI Reference:** None - Contains only calculation formulas without patient-specific data.



#### VitalReferenceRangeRule

**Entity Overview:** Age and gender-specific normal ranges for vital sign interpretation.

**Data Owner/Data Source:** Clinical guidelines, Medical reference standards

**Purpose of Entity:** Clinical interpretation support, abnormal value identification, age-appropriate assessment

**PHI Reference:** None - Contains only reference range rules without patient-specific measurements.



### 4.6 Laboratory System



#### LabTest

**Entity Overview:** Laboratory test catalog and reference information for diagnostic testing.

**Data Owner/Data Source:** Laboratory information systems, Clinical laboratory standards

**Purpose of Entity:** Laboratory test standardization, ordering support, result interpretation

**PHI Reference:** None - Contains only laboratory test definitions without patient-specific results.



#### LabTestGroup

**Entity Overview:** Logical groupings of related laboratory tests for efficient ordering and organization.

**Data Owner/Data Source:** Laboratory information systems, Clinical guidelines

**Purpose of Entity:** Laboratory test organization, ordering efficiency, clinical workflow

**PHI Reference:** None - Contains only test grouping information without patient-specific data.



#### LabFacility

**Entity Overview:** Laboratory facility information for test processing and result management.

**Data Owner/Data Source:** Laboratory service agreements, Healthcare system administration

**Purpose of Entity:** Laboratory coordination, result routing, quality assurance

**PHI Reference:** None - Contains only facility information without patient-specific data.



#### LabRequisition

**Entity Overview:** Laboratory requisition form templates for standardized test ordering.

**Data Owner/Data Source:** Laboratory information systems, Clinical workflow design

**Purpose of Entity:** Standardized test ordering, clinical workflow efficiency, requisition management

**PHI Reference:** None - Contains only form templates without patient-specific information.



#### LabRequisitionValue

**Entity Overview:** Form field values and structure for laboratory requisition forms.

**Data Owner/Data Source:** Laboratory information systems, Clinical workflow configuration

**Purpose of Entity:** Form structure definition, data collection standardization, workflow efficiency

**PHI Reference:** None - Contains only form field definitions without patient-specific data.



#### LabOrderItem

**Entity Overview:** Individual test components within laboratory orders for detailed ordering specification.

**Data Owner/Data Source:** Healthcare provider ordering, Laboratory information systems

**Purpose of Entity:** Detailed test specification, ordering accuracy, laboratory workflow

**PHI Reference:** Indirectly references PHI through association with patient laboratory orders.



#### LabReferenceRangeRule

**Entity Overview:** Age and gender-specific normal ranges for laboratory test interpretation.

**Data Owner/Data Source:** Laboratory reference standards, Clinical guidelines

**Purpose of Entity:** Laboratory result interpretation, abnormal value identification, clinical decision support

**PHI Reference:** None - Contains only reference range rules without patient-specific results.



#### LabComment

**Entity Overview:** Standardized comments and interpretations for laboratory results.

**Data Owner/Data Source:** Laboratory information systems, Clinical laboratory standards

**Purpose of Entity:** Result interpretation standardization, clinical communication, quality consistency

**PHI Reference:** None - Contains only standardized comments without patient-specific information.



#### LabTestCodeMapping

**Entity Overview:** Mapping between external laboratory codes and internal system codes for integration.

**Data Owner/Data Source:** Laboratory information system integration, Healthcare system administration

**Purpose of Entity:** System integration, code standardization, data exchange facilitation

**PHI Reference:** None - Contains only code mapping information without patient-specific data.



#### LabResultViewStatus

**Entity Overview:** Tracking system for laboratory result viewing and acknowledgment by healthcare providers.

**Data Owner/Data Source:** Healthcare provider workflow, Clinical system monitoring

**Purpose of Entity:** Result communication tracking, workflow completion, clinical accountability

**PHI Reference:** Indirectly references PHI through association with laboratory results and provider actions.



### 4.7 Medication Management



#### MedicationFavorite

**Entity Overview:** Healthcare provider medication prescribing favorites and templates for clinical efficiency.

**Data Owner/Data Source:** Healthcare provider preferences, Clinical workflow optimization

**Purpose of Entity:** Prescribing efficiency, clinical workflow optimization, medication management

**PHI Reference:** None - Contains only provider preferences without patient-specific information.



#### MedicationFavoriteItem

**Entity Overview:** Individual medication items within provider favorite prescribing templates.

**Data Owner/Data Source:** Healthcare provider preferences, Medication prescribing workflow

**Purpose of Entity:** Prescribing template management, clinical efficiency, medication standardization

**PHI Reference:** None - Contains only prescribing templates without patient-specific information.



#### MedicationInteractionStatus

**Entity Overview:** Drug interaction monitoring and status tracking for patient safety.

**Data Owner/Data Source:** Clinical decision support systems, Pharmaceutical interaction databases

**Purpose of Entity:** Medication safety monitoring, interaction prevention, clinical decision support

**PHI Reference:** Indirectly references PHI through association with patient medication profiles.



#### MedicationInteractionDetail

**Entity Overview:** Detailed information about drug interactions including severity and clinical significance.

**Data Owner/Data Source:** Pharmaceutical interaction databases, Clinical decision support systems

**Purpose of Entity:** Clinical decision support, medication safety, interaction management

**PHI Reference:** None - Contains only drug interaction reference information without patient-specific data.



### 4.8 Immunization System



#### ImmunizationDefinition

**Entity Overview:** Immunization product definitions and specifications for vaccination management.

**Data Owner/Data Source:** Public health authorities, Vaccine manufacturers, Immunization programs

**Purpose of Entity:** Immunization program management, vaccine tracking, public health reporting

**PHI Reference:** None - Contains only vaccine product definitions without patient-specific information.



### 4.9 Clinical Decision Support



#### CDMType

**Entity Overview:** Clinical Decision Making (CDM) type definitions for automated clinical assessments.

**Data Owner/Data Source:** Clinical guidelines, Healthcare system configuration, Medical algorithms

**Purpose of Entity:** Clinical decision support, automated assessment, care standardization

**PHI Reference:** None - Contains only CDM algorithms without patient-specific data.



#### CDMTypeVitalTypeLink

**Entity Overview:** Association between Clinical Decision Making types and vital sign measurements for automated assessment.

**Data Owner/Data Source:** Clinical guidelines, Healthcare system configuration

**Purpose of Entity:** Automated clinical assessment, decision support integration, care optimization

**PHI Reference:** None - Contains only algorithm configuration without patient-specific data.



#### RecallSetting

**Entity Overview:** Configuration settings for patient recall and follow-up notification systems.

**Data Owner/Data Source:** Healthcare system configuration, Clinical operations management

**Purpose of Entity:** Patient recall automation, preventive care delivery, follow-up management

**PHI Reference:** None - Contains only recall configuration without patient-specific information.



#### CareElementType

**Entity Overview:** Types and categories of care elements for preventive care and clinical intervention tracking.

**Data Owner/Data Source:** Clinical guidelines, Healthcare system configuration, Quality improvement programs

**Purpose of Entity:** Preventive care standardization, quality measurement, care tracking

**PHI Reference:** None - Contains only care element type definitions without patient-specific information.



### 4.10 Communication System



#### ChatRoom

**Entity Overview:** Communication rooms for healthcare team collaboration and clinical communication.

**Data Owner/Data Source:** Healthcare communication systems, Clinical team coordination

**Purpose of Entity:** Team communication, clinical collaboration, care coordination

**PHI Reference:** Indirectly references PHI through clinical communication content and care coordination.



#### Message

**Entity Overview:** Individual messages within healthcare team communication systems.

**Data Owner/Data Source:** Healthcare providers, Clinical communication systems

**Purpose of Entity:** Clinical communication, care coordination, team collaboration

**PHI Reference:** Indirectly references PHI through clinical communication content.



#### BaseMessage

**Entity Overview:** Base class for all message types in healthcare communication systems.

**Data Owner/Data Source:** Healthcare communication systems, Application architecture

**Purpose of Entity:** Communication system architecture, message standardization, system functionality

**PHI Reference:** Indirectly references PHI through message content and clinical communication.



#### MessageStatus

**Entity Overview:** Message delivery and read status tracking for healthcare communication systems.

**Data Owner/Data Source:** Healthcare communication systems, Message delivery tracking

**Purpose of Entity:** Communication reliability, message accountability, delivery confirmation

**PHI Reference:** Indirectly references PHI through association with clinical communications.



#### ScheduledMessage

**Entity Overview:** Scheduled message system for automated healthcare communications and notifications.

**Data Owner/Data Source:** Healthcare communication systems, Automated notification systems

**Purpose of Entity:** Automated communication, scheduled notifications, patient engagement

**PHI Reference:** Indirectly references PHI through patient communication and clinical notifications.



#### TicketReference

**Entity Overview:** Support ticket system references linking communications to clinical entities and issues.

**Data Owner/Data Source:** Healthcare support systems, Clinical communication workflows

**Purpose of Entity:** Support ticket management, issue tracking, clinical communication organization

**PHI Reference:** Indirectly references PHI through association with clinical entities and patient-related issues.



### 4.11 Task Management



#### WorkQueue

**Entity Overview:** Task and workflow management system for clinical operations and administrative processes.

**Data Owner/Data Source:** Healthcare providers, Clinical staff, Administrative personnel

**Purpose of Entity:** Clinical workflow management, task assignment and tracking, care coordination activities

**PHI Reference:** Directly references PHI through patient linkage and clinical task content. May contain clinical information in task descriptions and notes.



#### WorkQueueReference

**Entity Overview:** Reference linkages between work queue tasks and specific clinical records or entities.

**Data Owner/Data Source:** Healthcare workflow systems, Clinical task management

**Purpose of Entity:** Task context preservation, clinical workflow integration, care coordination

**PHI Reference:** Directly references PHI through linkage to patient records and clinical entities.



#### WorkQueueComment

**Entity Overview:** Comments and notes on work queue tasks for collaboration and task management.

**Data Owner/Data Source:** Healthcare providers, Administrative staff, Clinical teams

**Purpose of Entity:** Task collaboration, workflow communication, task management enhancement

**PHI Reference:** Indirectly references PHI through association with patient-related tasks and clinical workflow.



### 4.12 AI & Documentation



#### DocFormRequest

**Entity Overview:** Document and form generation requests for clinical documentation automation.

**Data Owner/Data Source:** Healthcare providers, Clinical documentation systems

**Purpose of Entity:** Documentation automation, form generation, clinical workflow efficiency

**PHI Reference:** Indirectly references PHI through association with patient documentation requests.



#### DocScreen

**Entity Overview:** Clinical documentation screen definitions and templates for structured data entry.

**Data Owner/Data Source:** Healthcare system configuration, Clinical documentation design

**Purpose of Entity:** Documentation standardization, clinical workflow optimization, data entry efficiency

**PHI Reference:** None - Contains only screen templates without patient-specific information.



#### OutboundCallScenario

**Entity Overview:** Automated outbound calling scenarios and scripts for patient communication.

**Data Owner/Data Source:** Healthcare communication systems, Patient engagement programs

**Purpose of Entity:** Automated patient communication, appointment reminders, care follow-up

**PHI Reference:** Indirectly references PHI through patient communication and care-related calling.



### 4.13 User Settings & Preferences



#### UserGeneralSettings

**Entity Overview:** User interface preferences and general system settings for healthcare system users.

**Data Owner/Data Source:** Individual system users, User preference management

**Purpose of Entity:** User experience customization, system usability, workflow optimization

**PHI Reference:** None - Contains only user interface preferences without patient-specific information.



#### UserNotificationPreference

**Entity Overview:** User notification preferences and delivery method configuration for healthcare communications.

**Data Owner/Data Source:** Individual system users, Notification system configuration

**Purpose of Entity:** Communication preference management, notification customization, user experience

**PHI Reference:** None - Contains only notification preferences without patient-specific information.



#### NotificationType

**Entity Overview:** Available notification types and categories for healthcare system communications.

**Data Owner/Data Source:** Healthcare system configuration, Communication system design

**Purpose of Entity:** Notification standardization, communication categorization, system functionality

**PHI Reference:** None - Contains only notification type definitions without patient-specific information.



### 4.14 Security & Authentication



#### Device

**Entity Overview:** Registered user devices for healthcare system access and security management.

**Data Owner/Data Source:** Healthcare system security, User device registration

**Purpose of Entity:** Device security management, access control, multi-factor authentication

**PHI Reference:** Indirectly references PHI through association with user access to clinical systems.



#### LoginAttempt

**Entity Overview:** User authentication attempt logging for security monitoring and access control.

**Data Owner/Data Source:** Healthcare system security, Authentication systems

**Purpose of Entity:** Security monitoring, access control, authentication audit trail

**PHI Reference:** Indirectly references PHI through association with user access attempts to clinical systems.



#### ForgetPasswordAttempt

**Entity Overview:** Password reset attempt tracking for security monitoring and user account management.

**Data Owner/Data Source:** Healthcare system security, User account management

**Purpose of Entity:** Security monitoring, account management, password reset tracking

**PHI Reference:** None - Contains only password reset attempts without patient-specific information.



#### PasswordHistory

**Entity Overview:** User password change history for security policy enforcement and account management.

**Data Owner/Data Source:** Healthcare system security, User account management

**Purpose of Entity:** Security policy enforcement, password history tracking, account security

**PHI Reference:** None - Contains only password history without patient-specific information.



#### PasswordExpiryConfig

**Entity Overview:** Password expiry policy configuration for healthcare system security management.

**Data Owner/Data Source:** Healthcare system security administration

**Purpose of Entity:** Security policy enforcement, password management, system security

**PHI Reference:** None - Contains only security policy configuration without patient-specific information.



#### UserFreezeModel

**Entity Overview:** User account freeze and suspension tracking for security and account management.

**Data Owner/Data Source:** Healthcare system security administration, Human resources management

**Purpose of Entity:** Account security management, user suspension tracking, security incident response

**PHI Reference:** None - Contains only account status information without patient-specific information.



### 4.15 File & Document Management



#### Attachment

**Entity Overview:** File attachment metadata and management system for healthcare documents and clinical files.

**Data Owner/Data Source:** Healthcare providers, Administrative staff, Document management systems

**Purpose of Entity:** File management, document storage, clinical documentation support

**PHI Reference:** Indirectly references PHI through association with patient documents and clinical files.



#### ReportNote

**Entity Overview:** Annotations and notes on generated reports for clinical and administrative reporting.

**Data Owner/Data Source:** Healthcare providers, Report users, Clinical documentation

**Purpose of Entity:** Report enhancement, clinical annotation, reporting workflow

**PHI Reference:** Indirectly references PHI through association with clinical reports and patient data.



#### ExternalReport

**Entity Overview:** Reports and documents received from external healthcare systems and organizations.

**Data Owner/Data Source:** External healthcare systems, Healthcare information exchanges

**Purpose of Entity:** External data integration, report management, clinical information sharing

**PHI Reference:** Directly references PHI through external clinical reports and patient information.



### 4.16 Billing & Financial



#### BillingCode

**Entity Overview:** Medical billing code definitions and fee schedule information for healthcare services.

**Data Owner/Data Source:** Provincial health authorities, Medical billing organizations, Healthcare system administration

**Purpose of Entity:** Billing standardization, fee schedule management, revenue cycle management

**PHI Reference:** None - Contains only billing code definitions without patient-specific information.



#### Billing

**Entity Overview:** Billing information and financial data for healthcare encounters and services.

**Data Owner/Data Source:** Healthcare billing systems, Revenue cycle management

**Purpose of Entity:** Healthcare billing, revenue management, financial reporting

**PHI Reference:** Indirectly references PHI through association with patient encounters and services.



#### InsuredCode

**Entity Overview:** Insurance billing codes and coverage information for insured healthcare services.

**Data Owner/Data Source:** Insurance organizations, Healthcare billing systems

**Purpose of Entity:** Insurance billing, coverage verification, claims processing

**PHI Reference:** None - Contains only insurance code definitions without patient-specific information.



#### InsuredBillingItem

**Entity Overview:** Individual billing line items for insured healthcare services and procedures.

**Data Owner/Data Source:** Healthcare billing systems, Insurance claim processing

**Purpose of Entity:** Detailed billing, claims processing, revenue management

**PHI Reference:** Indirectly references PHI through association with patient services and insurance claims.



#### Referral

**Entity Overview:** Healthcare referral tracking and management system for care coordination.

**Data Owner/Data Source:** Healthcare providers, Referral management systems

**Purpose of Entity:** Referral coordination, care transition management, specialist communication

**PHI Reference:** Directly references PHI through patient referral information and clinical context.



#### Synopsis

**Entity Overview:** Clinical encounter summaries and synopsis generation for care documentation.

**Data Owner/Data Source:** Healthcare providers, Clinical documentation systems

**Purpose of Entity:** Encounter summarization, clinical communication, documentation efficiency

**PHI Reference:** Directly references PHI through clinical encounter summaries and patient information.



#### Second

**Entity Overview:** Second opinion request and consultation management system.

**Data Owner/Data Source:** Healthcare providers, Clinical consultation systems

**Purpose of Entity:** Second opinion coordination, clinical consultation, expert review

**PHI Reference:** Directly references PHI through patient clinical information and consultation requests.



### 4.17 Data Management



#### Export

**Entity Overview:** Data export tracking and management for healthcare information sharing and reporting.

**Data Owner/Data Source:** Healthcare system administration, Data management systems

**Purpose of Entity:** Data export tracking, information sharing, regulatory reporting

**PHI Reference:** Directly references PHI through patient data exports and clinical information sharing.



#### ImportResult

**Entity Overview:** Data import result tracking for external healthcare information integration.

**Data Owner/Data Source:** Healthcare system integration, Data management systems

**Purpose of Entity:** Data import tracking, integration monitoring, data quality assurance

**PHI Reference:** Indirectly references PHI through association with imported patient data and clinical information.



### 4.18 System Infrastructure



#### MenuItem

**Entity Overview:** Application menu structure and navigation configuration for healthcare system interface.

**Data Owner/Data Source:** Healthcare system configuration, Application design

**Purpose of Entity:** User interface organization, system navigation, application functionality

**PHI Reference:** None - Contains only menu structure without patient-specific information.



#### AddressDetail

**Entity Overview:** Address information management for patients, providers, and healthcare facilities.

**Data Owner/Data Source:** Patients, Healthcare providers, Administrative staff

**Purpose of Entity:** Address management, contact information, location services

**PHI Reference:** Directly references PHI when associated with patient addresses and contact information.



#### AsyncEmail

**Entity Overview:** Asynchronous email processing and delivery system for healthcare communications.

**Data Owner/Data Source:** Healthcare communication systems, Email delivery services

**Purpose of Entity:** Email communication management, automated notifications, communication reliability

**PHI Reference:** Directly references PHI through patient communications and clinical notifications.



#### Feedback

**Entity Overview:** User feedback and suggestion system for healthcare application improvement.

**Data Owner/Data Source:** Healthcare system users, Quality improvement programs

**Purpose of Entity:** System improvement, user experience enhancement, quality feedback

**PHI Reference:** None - Contains only system feedback without patient-specific information.



#### CustomRevisionEntity

**Entity Overview:** Hibernate Envers audit revision tracking for data change management and compliance.

**Data Owner/Data Source:** Healthcare system audit systems, Data change tracking

**Purpose of Entity:** Data audit trail, regulatory compliance, change tracking

**PHI Reference:** Indirectly references PHI through audit trail of clinical data changes.



#### ReferralTemplate

**Entity Overview:** Reusable referral letter templates for standardized healthcare provider communications.

**Data Owner/Data Source:** Healthcare providers, Clinical communication templates

**Purpose of Entity:** Communication standardization, referral efficiency, clinical workflow

**PHI Reference:** None - Contains only referral templates without patient-specific information.



---



## 5. FINAL COMPLETENESS VERIFICATION



### **Complete Coverage Confirmed:**

✅ **Patient Chart Entities:** 35 entities with complete field-level documentation

✅ **Embedded PHI Fields:** 12 additional embedded fields documented

✅ **Inherited Audit Fields:** All audit and provenance fields documented for patient chart entities

✅ **System/Administrative Entities:** 83 entities with entity-level documentation

✅ **Total Coverage:** 118 @Entity classes + 9 @Embeddable classes + 6 @MappedSuperclass inheritance patterns



### **Privacy Impact Assessment Summary:**

**Total PHI-Containing Entities:** 35 patient chart entities

**Total Supporting Entities:** 83 system/administrative entities

**Embedded PHI Fields:** 12 additional fields from @Embeddable classes


**This Privacy Impact Assessment provides comprehensive documentation suitable for direct integration into compliance documentation systems and regulatory reporting requirements.**
