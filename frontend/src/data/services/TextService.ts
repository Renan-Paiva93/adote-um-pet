export const TextService = {
    limitarTexto(text: string, tamanhoMaximo: number): string{
        if(text.length < tamanhoMaximo){
            return text;
        }
        text.slice(0,tamanhoMaximo) + '...';
    }
}