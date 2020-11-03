import { Empresa } from './empresa';

export class Remetente{
	REM_Codigo: number;
	REM_Remetente: string;
	REM_Abreviado: string;
	REM_Fixo: string;
	REM_Movel: string;
	EMP_Codigo: Empresa;
	REM_Ativo: boolean;
}