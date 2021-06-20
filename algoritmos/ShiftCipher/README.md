### Shift Cipher

O Shift Cipher *cryptosystem* é um sistema de criptografia definido sobre o anel  <img src="../../images/ring.png" width="40"/>. Para codificar uma palavra nesse sistema devemos converter os caracteres formadores da palavra em seus respectivos valores numéricos através da seguinte relação:

<p style="align:center">
	<img src="../../images/alph_num.png">
</p>

Após converter cada caracter em seu valor numérico, o método Shift Cipher irá somar o valor do shift ao valor numérico, obtendo assim, o valor correspondente a um outro caracter. Aqui é **importantíssimo** observar que, estamos olhando os números de 0 até 25 como elementos do anel <img src="../../images/ring.png" width="40">, e não como elementos de <img src="../../images/z.png" width="10">.

#### Exemplo 
Se a palavra a ser codificada é "criptografia", e o valor do shift é 10, então o resultado será: "mbszdyqbkpsk". pois a sequência de caracteres "c r i p t o g r a f i a" é equivalente à sequência numérica "2 17 8 15 19 14 6 17 0 5 8 0" e somando 10 a cada termo dessa sequência obtemos: "12 27 18 25 29 24 16 27 10 15 18 10", entretanto, como observado acima, estamos no anel <img src="../../images/ring.png" width="40">, logo esta última sequência é equivalente a "12 1 18 25 3 24 16 1 10 15 18 10", que por sua vez é equivalente à sequência alfabética "m b s z d y q b k p s k".

#### Implementação



