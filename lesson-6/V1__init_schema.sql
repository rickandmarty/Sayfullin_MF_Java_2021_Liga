create table SCHOOL
(
    ID                 varchar(36) primary key  not null,
    NAME                varchar(255)             not null,
    ADDRESS                varchar(255)             not null
);
comment on column SCHOOL.NAME is 'Название';
comment on column SCHOOL.ADDRESS is 'Адрес';
comment on table SCHOOL is 'Школа';

create table TEACHER
(
    ID                 varchar(36) primary key  not null,
    FIO         varchar(255)             not null,
    AGE          integer,
    SEX             varchar(36),
    SCHOOL_ID	varchar(36),
    foreign key (SCHOOL_ID) references SCHOOL (ID)
);
comment on column TEACHER.FIO is 'ФИО';
comment on column TEACHER.AGE is 'Возраст';
comment on column TEACHER.SEX is 'Пол';
comment on column TEACHER.SCHOOL_ID is 'Идентификатор школы';
comment on table TEACHER is 'Учитель';

create table SUBJECT
(
    ID                 varchar(36) primary key  not null,
    NAME               varchar(255)             not null
);
comment on column SUBJECT.NAME is 'Название предмета';
comment on table SUBJECT is 'Предмет';

create table PUPIL
(
    ID                 varchar(36) primary key  not null,
    FIO         varchar(255)             not null,
    AGE          integer,
    SEX             varchar(36),
    SCHOOL_ID	varchar(36),
    foreign key (SCHOOL_ID) references SCHOOL (ID)
);
comment on column PUPIL.FIO is 'ФИО';
comment on column PUPIL.AGE is 'Возраст';
comment on column PUPIL.SEX is 'Пол';
comment on column PUPIL.SCHOOL_ID is 'Идентификатор школы';
comment on table PUPIL is 'Ученик';

create table PUPIL_SUBJECT
(
	 primary key (PUPIL_ID, SUBJECT_ID),
     PUPIL_ID varchar(36),
     SUBJECT_ID varchar(36),
	 foreign key (PUPIL_ID) references PUPIL(ID),
     foreign key (SUBJECT_ID) references SUBJECT(ID)
);
comment on table PUPIL_SUBJECT is 'Ученик - Предмет';

create table TEACHER_SUBJECT
(
	 primary key (TEACHER_ID, SUBJECT_ID),
     TEACHER_ID varchar(36),
     SUBJECT_ID varchar(36),
	 foreign key (TEACHER_ID) references TEACHER(ID),
     foreign key (SUBJECT_ID) references SUBJECT(ID)
);
comment on table TEACHER_SUBJECT is 'Учитель - Предмет';


