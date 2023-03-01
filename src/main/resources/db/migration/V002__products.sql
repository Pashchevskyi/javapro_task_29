CREATE TABLE IF NOT EXISTS public.products
(
    id bigint NOT NULL,
    cost double precision NOT NULL,
    name character varying(255) COLLATE pg_catalog."default",
    CONSTRAINT products_pkey PRIMARY KEY (id)
)

TABLESPACE pg_default;

ALTER TABLE IF EXISTS public.products
    OWNER to postgres;