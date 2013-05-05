import random
#--------------------------------------------------------------------------------------tratamento de entrada para duas opções
def tratamentodeErro2():
    entrada = input('Digite sua escolha: ')
    while(entrada not in ('1','2')):
        print('\a\aEntrada inválida! Tente novamente!')
        entrada = input('Digite sua escolha: ')
    return entrada 
#--------------------------------------------------------------------------------------regras
def regras():
    cabecalho('REGRAS')
    print()
#--------------------------------------------------------------------------------------nome dos jogadores
def nomeJogador():
    cabecalho('NOME DOS JOGADORES')
    jogador = []
    for i in range(2):
        miniMenu('Jogador'+str(i+1))      
        jogador.append(input('Nome: '))
        jogador[i] = str.upper(jogador[i])
    return jogador
#--------------------------------------------------------------------------------------função par ou impar
def par_impar():
    primeiro = random.randint(0,10)
    segundo = random.randint(0,10)
    print('O valor foi:',primeiro+segundo)
    if((primeiro + segundo)%2 == 0):
        return 1
    else:
        return 2
#--------------------------------------------------------------------------------------Print quem é par quem é impar
def printParImpar(parImpar,jogador):
    if(parImpar == '1'):
        miniMenu(jogador[0]+' é par')
        miniMenu(jogador[1]+' é impar')
    else:
        miniMenu(jogador[1]+' é par')
        miniMenu(jogador[0]+' é impar')
#--------------------------------------------------------------------------------------tratamento de erro da entrada do menu
def tratamentoMenu():
    escolhaMenu = input('>>-> Digite aqui o respectivo valor: ')
    while str.isdigit(escolhaMenu) == False or escolhaMenu not in ('1','2','3','4'):
        print('\a\aEscolha inválida! Digite um número inteiro entre 1 e 4')
        escolhaMenu = input('>>-> Digite aqui o respectivo valor: ')
    return escolhaMenu
#--------------------------------------------------------------------------------------mini menu
def miniMenu(nome):
    print(25*'-'+'\n'+nome+(25-len(nome))*' '+'|\n'+25*'-')
#--------------------------------------------------------------------------------------Print do menu do jogo
def printMenu():
    cabecalho('MENU')
    print('\n\nPara iniciar digite o número conforme a escolha:\n')
    print(16*'-'+'\n1-INICIAR      |\n'+16*'-'+'\n'+16*'-'+'\n2-REGRAS       |\n'+16*'-'+'\n'+16*'-'+'\n3-MUDAR JOGADOR|\n'+16*'-'+'\n'+16*'-'+'\n4-SAIR         |\n'+16*'-')

#---------------------------------------------------------------------------------------print de cabeçálho
def cabecalho(texto):
    print(80*'-'+80*'/'+80*'-'+'\n|'+(38 - ( len(texto) // 2))*' '+str.upper(texto)+(39 - ( len(texto) // 2))*' '+'|\n'+80*'-'+80*'/'+80*'-')

#---------------------------------------------------------------------------------------Randomiza as castas com nipes e valores
def embaralharCartas(sorteio):
    sequencia = [1,2,3,4,5,6]
    for i in range(6):
        rand = sorteio[random.randint(0,4)]
        sequencia[i] = rand
    return sequencia
#----------------------------------------------------------------------------------------contar pontos de coringa
def contarPontoCoringa(sequenciaNipe,pontos):
    contCoringa = 0
    for i in range(len(sequenciaNipe)):
        if 'CORINGA' in sequenciaNipe[i]:
            contCoringa +=  1
    if(contCoringa > 0):
        pontos = pontos**contCoringa
    return pontos 
#----------------------------------------------------------------------------------------contar pontos da mesma cor
def contarPontoCor(escolhaCor,sequenciaNipe,pontos):
    if escolhaCor == '1':
        for i in range(len(sequenciaNipe)):
            if 'copas' in sequenciaNipe[i] or 'ouros' in sequenciaNipe[i]:
                pontos += 50
    else:
        for i in range(len(sequenciaNipe)):
            if 'paus' in sequenciaNipe[i] or 'espadas' in sequenciaNipe[i]:
                pontos += 50
    return pontos
#-----------------------------------------------------------------------------------------contar pontos po nipe igual
def contarPontoNipe(sequenciaNipe,pontos,nipes):
    cont = 0
    for n in range(4):
        for i in range(len(sequenciaNipe)):
            if nipes[n] in sequenciaNipe[i]:
                cont += 1
        if(cont > 1):
            pontos += cont * 100
    return pontos
#---------------------------------------------------------------------------------------pontuação geral
def contarPontoGeral(pontoGeral,pontosJog):
    if(pontosJog[0] > pontosJog[1]):
        pontoGeral[0] += 1
    elif(pontosJog[0] < pontosJog[1]):
        pontoGeral[1] += 1
    return pontoGeral
#---------------------------------------------------------------------------------------Verifica a existência do coringa entre os nipes
                                                                                        # e retorna um valor aos valores das cartas
def verificaCoringa(sequenciaNipe,sequenciaValor):
    for i in range(6):
        if 'CORINGA' in sequenciaNipe[i]:
            sequenciaValor[i] = ';^)'
    return sequenciaValor
#----------------------------------------------------------------------------------------print evolução no jogo
def evoJogo(pontoGeral,sequencia):
    dicas1 = ['Parabéns você está ganhando \o/','Continue assim você está na frente ^^','Vamos lá parece que você vai ganhar OO','Falta pouco Oo']
    dicas2 = ['Não desista você vai conceguir ^^','Vamos lá reaja ¬¬','I tá feia a coisa =/','Falta pouco Oo']
    if(sequencia == 1):
        if(pontoGeral[0] < pontoGeral[1]):
            print('\n'+dicas2[random.randint(0,3)])
        elif(pontoGeral[1] > pontoGeral[0]):
            print('\n'+dicas1[random.randint(0,3)])
    elif(sequencia == 2):
        if(pontoGeral[1] < pontoGeral[0]):
            print('\n'+dicas2[random.randint(0,3)])
        elif(pontoGeral[1] > pontoGeral[0]):
            print('\n'+dicas1[random.randint(0,3)])
#----------------------------------------------------------------------------------------Mostra as cartas na tela
def mostraBaralho(sequenciaNipe,sequenciaValor):
    #--------------------------------------------------Printa a primeira linha da carta 
    for i in range(6):
        print('  '+' '+(8*"_")+' ', end="")
    print('\n',end='')
    #--------------------------------------------------Printa a linha com o respectivo Nipe
    for i in range(6):
        print('  '+'|'+(sequenciaNipe[i])+((8-len(sequenciaNipe[i]))*' ')+'|',end='')
    print('\n',end='')
    #--------------------------------------------------prita mais quatro linhas vazias
    for i in range(4):
        for i in range(6):
            print('  '+'|'+(8*' ')+'|',end='')
        print('\n',end='')
    #--------------------------------------------------printa a linha com o valor da carta    
    for i in range(6):
        print('  '+'|'+'  '+(sequenciaValor[i])+((6-len(sequenciaValor[i]))*' ')+'|',end='')
    print('\n',end='')
    #--------------------------------------------------Printa a última linha da carta
    for i in range(6):
        print('  '+' '+(8*'-')+' ',end='')
    print('\n',end='')
#----------------------------------------------------------------------------------------rodar o jogo
def rodaJogo(nipes,valor,jogador,sequencia,game,pontoGeral):
    partidas = 0
    while game == 'ON':
        pontosJog = [0,0]
        for i in range(2):
            cabecalho('ESCOLHA UMA COR')
            miniMenu('1 - VERMELHO')
            miniMenu('2 - PRETO')
            escolhaCor = tratamentoMenu()
            espera = input(' press ENTER para continuar...')
            cabecalho('Vamos às cartas!! \o/')
            if(sequencia == 1):
                print(jogador[0],end='')
            else:
                print(jogador[1],end='')
            espera = input(' press ENTER para puxar suas cartas...')
            #-------------------------------------------------embaralhando as cartas
            sequenciaNipe = embaralharCartas(nipes)
            sequenciaValor = embaralharCartas(valor)
            sequenciaValor = verificaCoringa(sequenciaNipe,sequenciaValor) 
            mostraBaralho(sequenciaNipe,sequenciaValor)
            #-------------------------------------------------atribuindo pontos
            if(sequencia == 1): 
                pontosJog[0] = contarPontoCor(escolhaCor,sequenciaNipe,pontosJog[0])
                pontosJog[0] = contarPontoNipe(sequenciaNipe,pontosJog[0],nipes)
                pontosJog[0] = contarPontoCoringa(sequenciaNipe,pontosJog[0])
            else:
                pontosJog[1] = contarPontoCor(escolhaCor,sequenciaNipe,pontosJog[1])
                pontosJog[1] = contarPontoNipe(sequenciaNipe,pontosJog[1],nipes)
                pontosJog[1] = contarPontoCoringa(sequenciaNipe,pontosJog[1])
            if(sequencia == 1):
                miniMenu(jogador[0])
                print(pontosJog[0])
            else:
                miniMenu(jogador[1])
                print(pontosJog[1])
            miniMenu('Placar')
            print(jogador[0]+' : '+str(pontoGeral[0])+' X '+jogador[1]+' : '+str(pontoGeral[1])+'\n\n')
            evoJogo(pontoGeral,sequencia)
            espera = input(' press ENTER para continuar...')
            cabecalho('Deseja finalizar o jogo?')
            miniMenu('1 - SIM')
            miniMenu('2 - NÃO')
            sair = tratamentodeErro2()
            if(sair == '1'):
                pontoGeral = contarPontoGeral(pontoGeral,pontosJog)
                partidas -= 1
                if(sequencia == 1):
                    print('O jogador '+jogador[0]+' decidio desistir!\nEntão o ganhador foi:')
                    cabecalho('\o/ Oo ;^) :^) XD =D '+jogador[1]+' \o/ Oo ;^) :^) XD =D')
                else:
                    print('O jogador '+jogador[1]+' decidio desistir!\nEntão o ganhador foi:')
                    cabecalho('\o/ Oo ;^) :^) XD =D '+jogador[0]+' \o/ Oo ;^) :^) XD =D')
                print('\n\nA pontuação foi: \n'+jogador[0]+' com',pontoGeral[0],'X',jogador[1]+' com',pontoGeral[1])
                espera = input(' press ENTER para sair...')
                quit()
            if(sequencia == 1):
                sequencia = 2
            else:
                sequencia = 1
        #-------------------------------------------------contando pontuação geral          
        pontoGeral = contarPontoGeral(pontoGeral,pontosJog)
        if(pontosJog[0] != pontosJog[1]):
            partidas += 1
        if(partidas > 7):
                game = 'OFF'
    cabecalho('FIM DE JOGO!')
    espera = input(' press ENTER para CONTINUAR...')
    return pontoGeral
        
        
