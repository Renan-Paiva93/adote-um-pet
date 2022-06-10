import { NextPage } from "next";
import Titulo from "../../ui/components/Titulo/Titulo";
import {
    Paper,
    TableContainer,
    Table,
    TableHead,
    TableRow,
    TableCell,
    TableBody
} from '@mui/material';
import { useRelatorio } from "../../data/hooks/pages/pets/useRelatorio";

const Relatorio: NextPage = () => {
    return (
        <>
            <Titulo
                titulo={'Relatório de Adção'}
                subtitulo={'Veja a lista de pets adotados'}
            />
            <TableContainer
                component={Paper}
                sx={{maxWidth: 830, mx: 'auto', p: {xs: 3, md: 5}}} // medidas das tabelas
            >
                <Table>
                    <TableHead>
                        <TableRow>
                           <TableCell>Pet</TableCell>
                           <TableCell>E-mail</TableCell> 
                           <TableCell align={'right'} >Valor Mensal</TableCell>  
                        </TableRow>
                    </TableHead>
                    <TableBody>
                        <TableRow>
                            <TableCell>teste</TableCell>
                            <TableCell>teste</TableCell>
                            <TableCell align={'right'} >50</TableCell>
                        </TableRow>
                    </TableBody>
                </Table>
            </TableContainer>
        </>
    )    
}

export default Relatorio;