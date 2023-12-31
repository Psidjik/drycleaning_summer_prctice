PGDMP     4        
            {            drycleaning_summerpractice    14.5    14.5 &    
           0    0    ENCODING    ENCODING        SET client_encoding = 'UTF8';
                      false            
           0    0 
   STDSTRINGS 
   STDSTRINGS     (   SET standard_conforming_strings = 'on';
                      false            
           0    0 
   SEARCHPATH 
   SEARCHPATH     8   SELECT pg_catalog.set_config('search_path', '', false);
                      false            
           1262    64293    drycleaning_summerpractice    DATABASE     w   CREATE DATABASE drycleaning_summerpractice WITH TEMPLATE = template0 ENCODING = 'UTF8' LOCALE = 'Russian_Russia.1251';
 *   DROP DATABASE drycleaning_summerpractice;
                postgres    false            �            1259    65057    clients    TABLE     �   CREATE TABLE public.clients (
    client_id integer NOT NULL,
    human_id integer,
    email character varying(20) NOT NULL
);
    DROP TABLE public.clients;
       public         heap    postgres    false            �            1259    65056    clients_client_id_seq    SEQUENCE     �   CREATE SEQUENCE public.clients_client_id_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 ,   DROP SEQUENCE public.clients_client_id_seq;
       public          postgres    false    210            
           0    0    clients_client_id_seq    SEQUENCE OWNED BY     O   ALTER SEQUENCE public.clients_client_id_seq OWNED BY public.clients.client_id;
          public          postgres    false    209            �            1259    65066 	   employees    TABLE     �   CREATE TABLE public.employees (
    employee_id integer NOT NULL,
    human_id integer,
    salary numeric(38,2) NOT NULL,
    post character varying(15) NOT NULL,
    contract_number character varying(25) NOT NULL
);
    DROP TABLE public.employees;
       public         heap    postgres    false            �            1259    65065    employees_employee_id_seq    SEQUENCE     �   CREATE SEQUENCE public.employees_employee_id_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 0   DROP SEQUENCE public.employees_employee_id_seq;
       public          postgres    false    212            
           0    0    employees_employee_id_seq    SEQUENCE OWNED BY     W   ALTER SEQUENCE public.employees_employee_id_seq OWNED BY public.employees.employee_id;
          public          postgres    false    211            �            1259    65075    humans    TABLE     �   CREATE TABLE public.humans (
    human_id integer NOT NULL,
    phone_number character varying(20) NOT NULL,
    first_name character varying(50) NOT NULL,
    last_name character varying(50) NOT NULL
);
    DROP TABLE public.humans;
       public         heap    postgres    false            �            1259    65074    humans_human_id_seq    SEQUENCE     �   CREATE SEQUENCE public.humans_human_id_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 *   DROP SEQUENCE public.humans_human_id_seq;
       public          postgres    false    214            
           0    0    humans_human_id_seq    SEQUENCE OWNED BY     K   ALTER SEQUENCE public.humans_human_id_seq OWNED BY public.humans.human_id;
          public          postgres    false    213            �            1259    65082    orders    TABLE     �   CREATE TABLE public.orders (
    client_id integer,
    cost numeric(38,2) NOT NULL,
    date_of_visit date NOT NULL,
    employee_id integer,
    order_id integer NOT NULL,
    item_name text
);
    DROP TABLE public.orders;
       public         heap    postgres    false            �            1259    65081    orders_order_id_seq    SEQUENCE     �   CREATE SEQUENCE public.orders_order_id_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 *   DROP SEQUENCE public.orders_order_id_seq;
       public          postgres    false    216            
           0    0    orders_order_id_seq    SEQUENCE OWNED BY     K   ALTER SEQUENCE public.orders_order_id_seq OWNED BY public.orders.order_id;
          public          postgres    false    215            k           2604    65060    clients client_id    DEFAULT     v   ALTER TABLE ONLY public.clients ALTER COLUMN client_id SET DEFAULT nextval('public.clients_client_id_seq'::regclass);
 @   ALTER TABLE public.clients ALTER COLUMN client_id DROP DEFAULT;
       public          postgres    false    209    210    210            l           2604    65069    employees employee_id    DEFAULT     ~   ALTER TABLE ONLY public.employees ALTER COLUMN employee_id SET DEFAULT nextval('public.employees_employee_id_seq'::regclass);
 D   ALTER TABLE public.employees ALTER COLUMN employee_id DROP DEFAULT;
       public          postgres    false    212    211    212            m           2604    65078    humans human_id    DEFAULT     r   ALTER TABLE ONLY public.humans ALTER COLUMN human_id SET DEFAULT nextval('public.humans_human_id_seq'::regclass);
 >   ALTER TABLE public.humans ALTER COLUMN human_id DROP DEFAULT;
       public          postgres    false    213    214    214            n           2604    65085    orders order_id    DEFAULT     r   ALTER TABLE ONLY public.orders ALTER COLUMN order_id SET DEFAULT nextval('public.orders_order_id_seq'::regclass);
 >   ALTER TABLE public.orders ALTER COLUMN order_id DROP DEFAULT;
       public          postgres    false    216    215    216            
          0    65057    clients 
   TABLE DATA           =   COPY public.clients (client_id, human_id, email) FROM stdin;
    public          postgres    false    210   �+       

          0    65066 	   employees 
   TABLE DATA           Y   COPY public.employees (employee_id, human_id, salary, post, contract_number) FROM stdin;
    public          postgres    false    212   Y,       
          0    65075    humans 
   TABLE DATA           O   COPY public.humans (human_id, phone_number, first_name, last_name) FROM stdin;
    public          postgres    false    214   �,       
          0    65082    orders 
   TABLE DATA           b   COPY public.orders (client_id, cost, date_of_visit, employee_id, order_id, item_name) FROM stdin;
    public          postgres    false    216   �-       
           0    0    clients_client_id_seq    SEQUENCE SET     D   SELECT pg_catalog.setval('public.clients_client_id_seq', 10, true);
          public          postgres    false    209            
           0    0    employees_employee_id_seq    SEQUENCE SET     G   SELECT pg_catalog.setval('public.employees_employee_id_seq', 4, true);
          public          postgres    false    211            
           0    0    humans_human_id_seq    SEQUENCE SET     B   SELECT pg_catalog.setval('public.humans_human_id_seq', 14, true);
          public          postgres    false    213            
           0    0    orders_order_id_seq    SEQUENCE SET     B   SELECT pg_catalog.setval('public.orders_order_id_seq', 11, true);
          public          postgres    false    215            p           2606    65064    clients clients_human_id_key 
   CONSTRAINT     [   ALTER TABLE ONLY public.clients
    ADD CONSTRAINT clients_human_id_key UNIQUE (human_id);
 F   ALTER TABLE ONLY public.clients DROP CONSTRAINT clients_human_id_key;
       public            postgres    false    210            r           2606    65062    clients clients_pkey 
   CONSTRAINT     Y   ALTER TABLE ONLY public.clients
    ADD CONSTRAINT clients_pkey PRIMARY KEY (client_id);
 >   ALTER TABLE ONLY public.clients DROP CONSTRAINT clients_pkey;
       public            postgres    false    210            t           2606    65073     employees employees_human_id_key 
   CONSTRAINT     _   ALTER TABLE ONLY public.employees
    ADD CONSTRAINT employees_human_id_key UNIQUE (human_id);
 J   ALTER TABLE ONLY public.employees DROP CONSTRAINT employees_human_id_key;
       public            postgres    false    212            v           2606    65071    employees employees_pkey 
   CONSTRAINT     _   ALTER TABLE ONLY public.employees
    ADD CONSTRAINT employees_pkey PRIMARY KEY (employee_id);
 B   ALTER TABLE ONLY public.employees DROP CONSTRAINT employees_pkey;
       public            postgres    false    212            x           2606    65080    humans humans_pkey 
   CONSTRAINT     V   ALTER TABLE ONLY public.humans
    ADD CONSTRAINT humans_pkey PRIMARY KEY (human_id);
 <   ALTER TABLE ONLY public.humans DROP CONSTRAINT humans_pkey;
       public            postgres    false    214            z           2606    65089    orders orders_pkey 
   CONSTRAINT     V   ALTER TABLE ONLY public.orders
    ADD CONSTRAINT orders_pkey PRIMARY KEY (order_id);
 <   ALTER TABLE ONLY public.orders DROP CONSTRAINT orders_pkey;
       public            postgres    false    216            ~           2606    65105 "   orders fkfhl8bv0xn3sj33q2f3scf1bq6 
   FK CONSTRAINT     �   ALTER TABLE ONLY public.orders
    ADD CONSTRAINT fkfhl8bv0xn3sj33q2f3scf1bq6 FOREIGN KEY (employee_id) REFERENCES public.employees(employee_id);
 L   ALTER TABLE ONLY public.orders DROP CONSTRAINT fkfhl8bv0xn3sj33q2f3scf1bq6;
       public          postgres    false    3190    216    212            |           2606    65095 %   employees fkjb27riyg43820pqtkkf98bulb 
   FK CONSTRAINT     �   ALTER TABLE ONLY public.employees
    ADD CONSTRAINT fkjb27riyg43820pqtkkf98bulb FOREIGN KEY (human_id) REFERENCES public.humans(human_id);
 O   ALTER TABLE ONLY public.employees DROP CONSTRAINT fkjb27riyg43820pqtkkf98bulb;
       public          postgres    false    214    212    3192            }           2606    65100 "   orders fkm2dep9derpoaehshbkkatam3v 
   FK CONSTRAINT     �   ALTER TABLE ONLY public.orders
    ADD CONSTRAINT fkm2dep9derpoaehshbkkatam3v FOREIGN KEY (client_id) REFERENCES public.clients(client_id);
 L   ALTER TABLE ONLY public.orders DROP CONSTRAINT fkm2dep9derpoaehshbkkatam3v;
       public          postgres    false    3186    216    210            {           2606    65090 #   clients fknw93yxwemp40exo2ao1r3eggr 
   FK CONSTRAINT     �   ALTER TABLE ONLY public.clients
    ADD CONSTRAINT fknw93yxwemp40exo2ao1r3eggr FOREIGN KEY (human_id) REFERENCES public.humans(human_id);
 M   ALTER TABLE ONLY public.clients DROP CONSTRAINT fknw93yxwemp40exo2ao1r3eggr;
       public          postgres    false    210    3192    214            
   p   x�E�K�0E���b*�g,�I�Z�¥(�H�=%C�]a �)޷h��#����.w�t=hNZ�gf�g�,쮩��ܰ_��	>��Ef��e�܋-H���Z�WHz��J�&��#7      

   I   x�3�4�47 =N��ļ�"NCC.#N#NsSTq##.cNcNStqcc.NN��cJnf��	W� �      
      x�=�MK1��3?F�|mr��O^b7lC�vۅ�띉�!�����vV�p]�\��
�`�*�tpp��9�{+��-�� c�"�,����V�p�F�<�9��[�לڿ��CаkS��\�%���K�U�Y#1�8c�s�Im�<m���82ӊMX�-d�A�$5xc᭦�������X���z�����6$b$���e�tY����d������Y3����Z�4$ӫ�#X���u���V��C�TRa�      
     x���MN�0���Sd_����w�0!,��	�
b��e)�6\��F����BB^�~o�73FJ�wZ���nu���<�_����)+�/����Єz��KUU��
3�q
��`Ƙ�x�����j�.V&��0��	�*%O2r̈́R�B�3y�a�EX��eA��7�ŉ�,~�Ċ���
>V�>���:��8�Zp`
&-����^�1���wF�5#<�|ү���s��BC��u����7!��p���"���DX@:u�SJ�S6�D     