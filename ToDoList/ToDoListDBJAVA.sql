PGDMP      8                 |            ToDoListDBJAVA    17rc1    17rc1     �           0    0    ENCODING    ENCODING        SET client_encoding = 'UTF8';
                           false            �           0    0 
   STDSTRINGS 
   STDSTRINGS     (   SET standard_conforming_strings = 'on';
                           false            �           0    0 
   SEARCHPATH 
   SEARCHPATH     8   SELECT pg_catalog.set_config('search_path', '', false);
                           false            �           1262    16386    ToDoListDBJAVA    DATABASE     �   CREATE DATABASE "ToDoListDBJAVA" WITH TEMPLATE = template0 ENCODING = 'UTF8' LOCALE_PROVIDER = libc LOCALE = 'Portuguese_Brazil.1252';
     DROP DATABASE "ToDoListDBJAVA";
                     postgres    false                        2615    2200    public    SCHEMA        CREATE SCHEMA public;
    DROP SCHEMA public;
                     pg_database_owner    false            �           0    0    SCHEMA public    COMMENT     6   COMMENT ON SCHEMA public IS 'standard public schema';
                        pg_database_owner    false    4            �            1259    16387    tasks    TABLE     �   CREATE TABLE public.tasks (
    nome character varying(255),
    descricao character varying(255),
    situacao character varying(7),
    id integer NOT NULL
);
    DROP TABLE public.tasks;
       public         heap r       postgres    false    4            �            1259    16392    tasks_id_seq    SEQUENCE     �   CREATE SEQUENCE public.tasks_id_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 #   DROP SEQUENCE public.tasks_id_seq;
       public               postgres    false    217    4            �           0    0    tasks_id_seq    SEQUENCE OWNED BY     =   ALTER SEQUENCE public.tasks_id_seq OWNED BY public.tasks.id;
          public               postgres    false    218            !           2604    16393    tasks id    DEFAULT     d   ALTER TABLE ONLY public.tasks ALTER COLUMN id SET DEFAULT nextval('public.tasks_id_seq'::regclass);
 7   ALTER TABLE public.tasks ALTER COLUMN id DROP DEFAULT;
       public               postgres    false    218    217            �          0    16387    tasks 
   TABLE DATA           >   COPY public.tasks (nome, descricao, situacao, id) FROM stdin;
    public               postgres    false    217   :       �           0    0    tasks_id_seq    SEQUENCE SET     :   SELECT pg_catalog.setval('public.tasks_id_seq', 3, true);
          public               postgres    false    218            #           2606    16395    tasks tasks_pkey 
   CONSTRAINT     N   ALTER TABLE ONLY public.tasks
    ADD CONSTRAINT tasks_pkey PRIMARY KEY (id);
 :   ALTER TABLE ONLY public.tasks DROP CONSTRAINT tasks_pkey;
       public                 postgres    false    217            �   �   x�M�1
�@E��S|/ DO�FV���f���d�$�Yx�\��|x�����iz1�? ���x$����PK���*6(���ް��JũU$�$��g�^�m?���]y.i��-?�3�c��س�+�$����tν��:      