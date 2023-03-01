CREATE TABLE IF NOT EXISTS public.orders_products
(
    order_id bigint NOT NULL,
    product_id bigint NOT NULL,
    CONSTRAINT uk_qmviv5y7625wak8tjq4nirybh UNIQUE (product_id),
    CONSTRAINT fke4y1sseio787e4o5hrml7omt5 FOREIGN KEY (order_id)
        REFERENCES public.orders (id) MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE CASCADE,
    CONSTRAINT fkqgxvu9mvqx0bv2ew776laoqvv FOREIGN KEY (product_id)
        REFERENCES public.products (id) MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE CASCADE,
    CONSTRAINT oppk PRIMARY KEY(order_id, product_id)
)

TABLESPACE pg_default;

ALTER TABLE IF EXISTS public.orders_products
    OWNER to postgres;