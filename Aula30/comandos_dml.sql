# ============================================================================================= INSERT ============================================================================================

# turma -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
insert into turma (id, serie, turno) values (1, '8 ano', 'manhã');
insert into turma (serie, turno) values ('9 ano', 'manhã');
insert into turma (id, serie, turno) values (4, '7 ano', 'manhã');
insert into turma (serie, turno) values ('6 ano', 'manhã');

# estudante ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
insert into estudante (matricula, nome) values ('123456', 'Fulano de tal');
insert into estudante (matricula, nome) values ('123458', 'Beltrano de tal');

# estudante_turma ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
insert into estudante_turma (id_estudante, id_turma) values (1, 1);
insert into estudante_turma (id_estudante, id_turma) values (1, 2);
insert into turma (serie, turno) values ('5 ano', 'Manhã');
insert into turma (serie, turno) values ('4 ano', 'manha');

# turno -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
insert into turno (nome) values ('manhã');
insert into turno (nome) values ('tarde');
insert into turno (nome) values ('noite');

# ============================================================================================ SELECT ============================================================================================

# turma -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
select * from turma;
select * from turma where binary turno = 'manhã';
update turma set id_turno = 1 where turno = 'manhã'; # is null, para todos também serviria (só serve para null)
update turma set id_turno = 2 where turno = 'tarde';
update turma set turno = 'tarde' where id = 6;

# estudante ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
select * from estudante;

select estudante.id, estudante.matricula, estudante.nome, turma.serie, turno.nome 
from estudante
inner join estudante_turma on (estudante.id = estudante_turma.id_estudante)
inner join turma on (estudante_turma.id_turma = turma.id)
inner join turno on (turma.id_turno = turno.id);

select *
from estudante
left join estudante_turma on (estudante.id = estudante_turma.id_estudante)
left join turma on (estudante_turma.id_turma = turma.id)
left join turno on (turma.id_turno = turno.id);

select estudante.id, estudante.matricula, estudante.nome, turma.serie, turno.nome
from estudante
left join estudante_turma on (estudante.id = estudante_turma.id_estudante)
left join turma on (estudante_turma.id_turma = turma.id)
left join turno on (turma.id_turno = turno.id)
where estudante.id = 2; # não interferiria na performance

select estudante.id, estudante.matricula, estudante.nome, turma.serie, turno.nome
from estudante
left join estudante_turma on (estudante.id = estudante_turma.id_estudante)
left join turma on (estudante_turma.id_turma = turma.id)
left join turno on (turma.id_turno = turno.id)
where estudante.id <= 2; 

select estudante.id, estudante.matricula, estudante.nome, turma.serie, turno.nome
from estudante
left join estudante_turma on (estudante.id = estudante_turma.id_estudante)
left join turma on (estudante_turma.id_turma = turma.id)
left join turno on (turma.id_turno = turno.id)
where estudante.id between 0 and 1; 

select estudante.id, estudante.matricula, estudante.nome, turma.serie, turno.nome
from estudante
left join estudante_turma on (estudante.id = estudante_turma.id_estudante)
left join turma on (estudante_turma.id_turma = turma.id)
left join turno on (turma.id_turno = turno.id)
where estudante.id in (2, 6);

select estudante.id, estudante.matricula, estudante.nome, turma.serie, turno.nome
from estudante
left join estudante_turma on (estudante.id = estudante_turma.id_estudante)
left join turma on (estudante_turma.id_turma = turma.id)
left join turno on (turma.id_turno = turno.id)
where turno.nome in ('manhã', 'tarde');

select estudante.id, estudante.matricula, estudante.nome, turma.serie, turno.nome
from estudante
left join estudante_turma on (estudante.id = estudante_turma.id_estudante)
left join turma on (estudante_turma.id_turma = turma.id)
left join turno on (turma.id_turno = turno.id)
where turno.nome in ('manhã') and turma.serie = '9 ano';

select estudante.id, estudante.matricula, estudante.nome, turma.serie, turno.nome
from estudante
left join estudante_turma on (estudante.id = estudante_turma.id_estudante)
left join turma on (estudante_turma.id_turma = turma.id)
left join turno on (turma.id_turno = turno.id)
where turno.nome in ('manhã') and turma.serie like '9%';

select estudante.id, estudante.matricula, estudante.nome, turma.serie, turno.nome
from estudante
left join estudante_turma on (estudante.id = estudante_turma.id_estudante)
left join turma on (estudante_turma.id_turma = turma.id)
left join turno on (turma.id_turno = turno.id)
where turno.nome in ('manhã') and turma.serie like '%ano';

select estudante.id, estudante.matricula, estudante.nome, turma.serie, turno.nome
from estudante
left join estudante_turma on (estudante.id = estudante_turma.id_estudante)
left join turma on (estudante_turma.id_turma = turma.id)
left join turno on (turma.id_turno = turno.id)
where turno.nome in ('manhã') and turma.serie like '%ano%';

select * 
from turno
left join turma on (turma.id_turno = turno.id);

select * 
from turma 
right join turno on (turma.id_turno = turno.id); 

# estudante_turma ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
select * from estudante_turma;

# turno -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
select * from turno;

# ============================================================================================ DELETE ============================================================================================

# turno -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
delete from turno where id = 4; # o auto_increment não percebe se você deletar e inserir denovo