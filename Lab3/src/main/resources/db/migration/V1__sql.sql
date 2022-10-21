CREATE TABLE public.film (
                             id uuid NOT NULL,
                             name character varying(25),
                             rating character varying(25),
                             genre character varying(25),
                             producer character varying(25)
);



CREATE TABLE public.roles (
                                  name character varying NOT NULL);


CREATE TABLE public.starring (
                              id uuid NOT NULL,
                              firstname character varying(25),
                              lastname character varying(25),
                              name character varying(25)

                    );

CREATE TABLE public.producer (
    name character varying NOT NULL);

ALTER TABLE ONLY public.roles
    ADD CONSTRAINT user_roles_pkey PRIMARY KEY (name);

ALTER TABLE ONLY public.film
    ADD CONSTRAINT film_pkey PRIMARY KEY (name);

ALTER TABLE ONLY public.starring
    ADD CONSTRAINT starring_pkey PRIMARY KEY (id);

ALTER TABLE ONLY public.producer
    ADD CONSTRAINT producers_pkey PRIMARY KEY (name);



INSERT INTO film (id,name,rating,genre,producer) VALUES ('ba64839d-c13b-4291-9aa3-5db1a2ffe839','Kin-dza-dza',7,'Drama','Alex');
INSERT INTO film (id,name,rating,genre,producer) VALUES ('92b76ba8-5d3c-43b9-8964-690bc510e73c','Matrix 4',4,'Triller','Lili');

INSERT INTO starring (id,firstname,lastname,name) VALUES ('6e23efb1-e127-4e4f-93fc-042e8b522da1','Keany','Rivz','Neo');
INSERT INTO starring (id,firstname,lastname,name) VALUES ('683d8356-f161-4c9d-afd6-4c32c613a446','Dmitry','Zhalnin','Test');


INSERT INTO roles (name) VALUES ('Neo');
INSERT INTO roles (name) VALUES ('Test');

INSERT INTO producer (name) VALUES ('Alex');
INSERT INTO producer (name) VALUES ('Lili');
