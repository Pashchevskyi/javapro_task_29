CREATE TABLE IF NOT EXISTS public.orders
(
    id bigint NOT NULL,
    cost double precision NOT NULL,
    date timestamp(6) without time zone,
    CONSTRAINT orders_pkey PRIMARY KEY (id)
)

TABLESPACE pg_default;

ALTER TABLE IF EXISTS public.orders
    OWNER to postgres;