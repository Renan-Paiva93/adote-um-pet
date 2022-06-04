import { useState } from "react";
import { Pet }  from '../../@types/Pet';

export function useIndex() {
    const [listaPets, setListaPets] = useState(
        [
            {
              id: 1,
              nome: 'bidu',
              historica: 'era uma vez blablabla',
              foto:'https://static.wixstatic.com/media/1b82a5_503c2f4782ee416b8d65b75b3b9bea42~mv2.jpg/v1/fill/w_800,h_600,al_c,q_90/1b82a5_503c2f4782ee416b8d65b75b3b9bea42~mv2.jpg'
            },
            {
              id: 2,
              nome: 'Scooby',
              historica: 'era uma vez blablabla',
              foto:'https://www.acasadoanimal.com.br/wp-content/uploads/2018/10/pet.png'
            },
          ]
    ),
          [petSelecionado, setPetSelecionado] = useState<Pet | null>(null), 
          [email, setEmail] = useState(''),
          [valor, setValor] = useState(''),
          [mensagem, setMensagem] = useState('');

    function adotar(){}

    return {
        listaPets,
        petSelecionado,
        setPetSelecionado,
        email,
        setEmail,
        valor,
        setValor,
        mensagem, 
        setMensagem,
        adotar
    };
}