# Repositório de Criptografia

Este repositório está sendo construído com o objetivo de registrar alguns avanços que venho fazendo na teoria de criptografia. Aqui estarão disponíveis os principais algoritmos que eu venha a implementar, bem como algumas notas de aula referentes aos principais tópicos.

Para este projeto irei utilizar o livro [*Cryptography: Theory and Practice*](https://www.amazon.com.br/Cryptography-Practice-Douglas-Robert-Stinson-dp-1138197017/dp/1138197017/ref=dp_ob_image_bk).



## O que é criptografia?

![image info](./images/head.jpg)

Para responder esta pergunta vamos imaginar uma situação em que duas pessoas precisam se comunicar secretamente. Elas precisam garantir que o conteúdo da mensagem seja entregue integralmente ao destinatário, e mais, que a mensagem não seja entendida por terceiros. Para isso elas irão utilizar "chaves", que irão transformar a mensagem original em um texto codificado que será enviado ao destinatário e, dessa forma, o destinatário írá utilizar uma chave para fazer o processo inverso, transformar o texto codificado para a mensagem original. 

Portanto, fica claro que a criptografia é um conjunto de técnicas utilizadas para transformar um conjunto de dados em um novo conjunto de dados (cifrados), que só podem ser decifrados por quem tenha a "chave" de acesso.

