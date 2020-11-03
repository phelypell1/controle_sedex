import { Destinatario } from './destinatario';
import { Estado } from './estado';
import { Cidade } from './Cidade';
import { Remetente } from './remetente';
import { Empresa } from './empresa';
export class RegistroSedex{

	SED_Codigo: number;
	SED_Data: Date;
	SED_DataPostagem: Date;
	EMP_Codigo: Empresa;
	REM_Codigo: Remetente;
	CID_Codigo: Cidade;
	EST_Codigo: Estado;
	DES_Codigo: Destinatario;
	SED_Cod_Rastreamento: string;
	SED_Valor: DoubleRange;
	SED_Pago: boolean;
	SED_Extraviou: boolean;
	SED_Operador: string;
	SED_DataModificacao: Date;

}