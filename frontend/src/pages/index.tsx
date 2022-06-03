import type { NextPage } from 'next'
import Titulo from '../ui/components/Titulo/Titulo';
import Lista from '../ui/components/Lista/Lista';


const Home: NextPage = () => {
  return (
    <div>
     <Titulo 
     titulo="" 
     subtitulo={
     <span>
       Com um pequeno valor mensal, você <br />
       pode <strong>adotar seu pet virtualmente</strong>
     </span>
     } />

     <Lista 
      pets={[
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
      ]}
     />
    </div>
  )
}

export default Home
