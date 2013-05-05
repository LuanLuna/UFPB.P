"""----------------------------------------------------------------------------------------------------------------------------
Mini Projeto da primeira unidade - Introdução a programação - lcc - 2011.2
Tipo: a senha
Alunos:
        Luan de Luna Santos - 81121050
        Robsom Soares de Lima - 81121047

----------------------------------------------------------------------------------------------------------------------------"""

#--------------------------------------------------------------------------------------------------------------------importações
import random
#--------------------------------------------------------------------------------------------------------------------menu principal
print(160*'-'+'\n|'+26*' '+'Bem vindo ao jogo: A SENHA'+26*' '+'|\n'+160*'-')   #faz um cabeçalho
jogador = input('\n>-->> Digite aqui o seu nome: ')  #recebe o nome do jogador
jogador = jogador.capitalize()  #transforma a primeira letra da string e maiúscula
print('\n\n'+160*'-'+'\n|'+32*' '+'MENU PRINCIPAL'+32*' '+'|\n'+160*'-')       #faz um cabeçalho
print('\n\nPara iniciar digite o número conforme a escolha:\n')  #informções de menu
print(16*'-'+'\n1-INICIAR      |\n'+16*'-'+'\n'+16*'-'+'\n2-REGRAS       |\n'+16*'-'+'\n'+16*'-'+'\n3-MUDAR JOGADOR|\n'+16*'-'+'\n'+16*'-'+'\n4-SAIR         |\n'+16*'-')
escolha_menu = input('\n>-->> Digite aqui o número conforme a escolha: ')
#--------------------------------------------------------------------------------------------------------------------jogo
while(escolha_menu != '4'):
    #----------------------------------------------------------------------------------------------------------------start
    if(escolha_menu == '1'):  #Condição de início do jogo
        #--------------------------Randomização de cores
        cor1 = random.randint(1,6) # "cor1" == cor1_randomizada
        cor2 = random.randint(1,6)
        while cor2 == cor1:
            cor2 = random.randint(1,6)
        cor3 = random.randint(1,6) 
        while cor3 == cor2 or cor3 == cor1:
            cor3 = random.randint(1,6) 
        cor4 = random.randint(1,6)
        while cor4 == cor2 or cor4 == cor1 or cor4 == cor3:
            cor4 = random.randint(1,6)
        #--------------------------
        tentativas = 6      #armazena o número de tentativas
        print(160*'-'+'\n|'+31*' '+'O JOGO COMEÇOU !'+31*' '+'|\n'+160*'-')
        print(jogador+' A senha foi gerada!\nVocê terá 6(seis) tentativas para encontra-la!\n\n BOA SORTE!!!\n\n')
        while(tentativas > 0):  #define o número de vezes que o jogo vai rodar
            acertoTotal = 0
            acertoParcial = 0
            erro = 0
            print(160*'-'+'\n|'+28*' '+str(tentativas)+' TENTATIVAS RESTANTES'+28*' '+'|\n'+160*'-')  #mostra quantas tentativas restam
            print('\nDigite:\n\n1-AZUL\n2-AMARELO\n3-VERMELHO\n4-PRETO\n5-VERDE\n6-ROSA\n')
            #------------------------------------------------------------------------------entradas do jogo
            cont_entr = 1
            while(cont_entr < 5):
                if(cont_entr == 1):
                    test = 'f' # f ou v testam a igualdade entre as entradas
                    escolha1=input('>-->> Digite primeira cor: ') #entrada em str para tratamento de erro
                    while(test == 'f'):
                        if(escolha1 == '1' or escolha1 == '2' or escolha1 == '3' or escolha1 == '4' or escolha1 == '5' or escolha1 == '6'):
                            escolha1 = int(escolha1) #trasformação da entrada em inteiro para verificação com a cor randomizada
                            test = 'v'  # f ou v testam a igualdade e aentrada inválida do usuário entre as entradas
                            cont_entr = 2
                        else:
                            print('Número inválido! Digite um número inteiro de 1 à 6, sem repetir o número\a') # o "\a" serve para emitir um aviso sonoro de erro
                            escolha1 = input('>-->> Digite primeira cor: ')
                #----------------------------------------------
                elif cont_entr == 2:
                    test = 'f'
                    escolha2 = input('>-->> Digite segunda cor: ')
                    while(test == 'f'):               
                        if (escolha2 == '1' or escolha2 == '2' or escolha2 == '3' or escolha2 == '4' or escolha2 == '5' or escolha2 == '6'):
                            escolha2 = int(escolha2)
                            if(escolha2 == escolha1):
                                print('Número inválido! Digite um número inteiro de 1 à 6, sem repetir o número\a') # o "\a" serve para emitir um aviso sonoro de erro
                                escolha2 = input('>-->> Digite segunda cor: ')
                            else:
                                test = 'v'
                                cont_entr = 3
                        else:
                            print('Número inválido! Digite um número inteiro de 1 à 6, sem repetir o número\a') # o "\a" serve para emitir um aviso sonoro de erro
                            escolha2 = input('>-->> Digite segunda cor: ')
                #----------------------------------------------
                elif cont_entr == 3:
                    test = 'f'
                    escolha3 = input('>-->> Digite terceira cor: ')
                    while(test == 'f'):
                        if (escolha3 == '1' or escolha3 == '2' or escolha3 == '3' or escolha3 == '4' or escolha3 == '5' or escolha3 == '6'):
                            escolha3 = int(escolha3)
                            if(escolha3 == escolha2 or escolha3 == escolha1):
                                print('Número inválido! Digite um número inteiro de 1 à 6, sem repetir o número\a') # o "\a" serve para emitir um aviso sonoro de erro
                                escolha3 = input('>-->> Digite terceira cor: ')
                            else:
                                test = 'v'
                                cont_entr = 4
                        else:
                            print('Número inválido! Digite um número inteiro de 1 à 6, sem repetir o número\a') # o "\a" serve para emitir um aviso sonoro de erro
                            escolha3 = input('>-->> Digite terceira cor: ')
                #----------------------------------------------
                elif cont_entr == 4:
                    test = 'f'
                    escolha4 = input('>-->> Digite quarta cor: ')
                    while(test == 'f'):
                        if (escolha4 == '1' or escolha4 == '2' or escolha4 == '3' or escolha4 == '4' or escolha4 == '5' or escolha4 == '6'):
                            escolha4 = int(escolha4)
                            if(escolha4 == escolha2 or escolha4 == escolha3 or escolha4 == escolha1):
                                print('Número inválido! Digite um número inteiro de 1 à 6, sem repetir o número\a') # o "\a" serve para emitir um aviso sonoro de erro
                                escolha4 = input('>-->> Digite quarta cor: ')
                            else:
                                test = 'v'
                                cont_entr = 5
                        else:
                            print('Número inválido! Digite um número inteiro de 1 à 6, sem repetir o número\a') # o "\a" serve para emitir um aviso sonoro de erro
                            escolha4 = input('>-->> Digite quarta cor: \n')
            print('\nA sua senha foi:',escolha1,escolha2,escolha3,escolha4) #print das cores escolhidas pelo usuário
            #-----------------------------------------------------------------------------------------comparação das cores e definição de acertos parciais e totais
            #-----------------------------------------------------------------------cor1
            if(escolha1 == cor1):
                acertoTotal += 1
            elif(escolha1 == cor2 or escolha1 == cor3 or escolha1 == cor4):
                acertoParcial += 1
            else:
                erro += 1
            #-----------------------------------------------------------------------cor2
            if(escolha2 == cor2):
                acertoTotal += 1
            elif(escolha2 == cor1 or escolha2 == cor3 or escolha2 == cor4):
                acertoParcial += 1
            else:
                erro += 1
            #-----------------------------------------------------------------------cor3
            if(escolha3 == cor3):
                acertoTotal += 1
            elif(escolha3 == cor2 or escolha3 == cor1 or escolha3 == cor4):
                acertoParcial += 1
            else:
                erro += 1
            #-----------------------------------------------------------------------cor4
            if(escolha4 == cor4):
                acertoTotal += 1
            elif(escolha4 == cor2 or escolha4 == cor3 or escolha4 == cor1):
                acertoParcial += 1
            else:
                erro += 1
            #---------------------------------------------------------------------------------------------------------verificação da senha
            #---------------------senha certa
            if(acertoTotal==4):
                print(160*'-'+'\n|'+24*' '+';^) PARABÉNS VOCÊ ACERTOU! :^)'+24*' '+'|\n'+160*'-')
                if tentativas == 6:
                    print('\n*Jogador:',jogador,'\n*Pontuação: 1000\n*Tentativas restantes:',tentativas)
                else:
                    print('\n*Jogador:',jogador,'\n*Pontuação:',tentativas * 100,'\n*Tentativas restantes:',tentativas)
                tentativas = 0  
            #-----------------------senha errada
            else:
                print('\n'+22*'-'+'\n Senha incorreta! :^O \n'+22*'-')
                print('\nVocê teve:\n>-->>',acertoTotal,'acerto(s)\n>-->>',acertoParcial,'acerto(s) parcial\n>-->>',erro,'erro(s)')
                tentativas-=1  #diminui as tentativas
                #-----------------------fim de tentativas
                if tentativas == 0:
                    print(160*'-'+'\n|'+25*' '+':^o GAME OVER PRA VOCÊ :^('+25*' '+'|\n'+160*'-')
            #---------------------------------------------------------------transformação dos números randomizados em cores
            if(tentativas == 0):
                if(cor1 == 1):
                    cor1 = 'AZUL'
                elif(cor1 == 2):
                    cor1 = 'AMARELO'
                elif(cor1 == 3):
                    cor1 = 'VERMELHO'
                elif(cor1 == 4):
                    cor1 = 'PRETO'
                elif(cor1 == 5):
                    cor1 = 'VERDE'
                else:
                    cor1 = 'ROSA'
                #----------------------------------------------------------
                if(cor2 == 1):
                    cor2 = 'AZUL'
                elif(cor2 == 2):
                    cor2 = 'AMARELO'
                elif(cor2 == 3):
                    cor2 = 'VERMELHO'
                elif(cor2 == 4):
                    cor2 = 'PRETO'
                elif(cor2 == 5):
                    cor2 = 'VERDE'
                else:
                    cor2 = 'ROSA'
                #----------------------------------------------------------
                if(cor3 == 1):
                    cor3 = 'AZUL'
                elif(cor3 == 2):
                    cor3 = 'AMARELO'
                elif(cor3 == 3):
                    cor3 = 'VERMELHO'
                elif(cor3 == 4):
                    cor3 = 'PRETO'
                elif(cor3 == 5):
                    cor3 = 'VERDE'
                else:
                    cor3 = 'ROSA'
                #----------------------------------------------------------
                if(cor4 == 1):
                    cor4 = 'AZUL'
                elif(cor4 == 2):
                    cor4 = 'AMARELO'
                elif(cor4 == 3):
                    cor4 = 'VERMELHO'
                elif(cor4 == 4):
                    cor4 = 'PRETO'
                elif(cor4 == 5):
                    cor4 = 'VERDE'
                else:
                    cor4 = 'ROSA'
                print('\n*SENHA: |',cor1,'|',cor2,'|',cor3,'|',cor4,'|')
                pressEnter = input('\n\nPressione ENTER para continuar!')  #variável para espera de comando
    #------------------------------------------------------------------------------------------------------adicionais do menu
    elif(escolha_menu == '2'):  #regras de jogo
        print(160*'-'+'\n|'+32*' '+'REGRAS DO JOGO'+32*' '+'|\n'+160*'-')
        print('\n\nRegras do jogo A SENHA:\nVocê jogará contra a máquina, e terá\n6(seis) chances de supera-la!\nO seu objetivo é encontrar a sequência de\n4(quatro) cores que a máquina gerar!\nVocê terá que digitar números\nconforme as cores listadas abaixo!\nessas cores são:\n\n1-AZUL\n2-AMARELO\n3-VERMELHO\n4-PRETO\n5-VERDE\n6-ROSA\n\nNão poderá digitar letras ou números negativos\ndeve-se digitar apenas números positivos, inteiros,\nde 1 à 6.\nCada tentativa tem um número diferente de pontos,\nquanto menos tentativas usar\nmais pontos você terá!\n\nBom jogo!\n\n')
        perssEnter = input('pressione ENTER para continuar!')  #variável para espera de comando
    elif(escolha_menu == '3'): #muda o nome do jogador
        print(160*'-'+'\n|'+32*' '+'MUDAR  JOGADOR'+32*' '+'|\n'+160*'-')
        jogador = input('\n\n>-->>Digite o nome do novo jogador: ')
        jogador = jogador.capitalize()  
    else: #erro de entrada do usuário
        print('\a\a\a>-->> Entrada inválida! Tente um número inteiro de 1 à 4!\n\n')
        pressEnter = input('pressione ENTER para continuar!')  #variável para espera de comando
    #-----------------------------------------------------------------------------------------------------retornando ao menu
    print(160*'-'+'\n|'+32*' '+'MENU PRINCIPAL'+32*' '+'|\n'+160*'-')
    print('\n\nPara iniciar digite o número conforme a escolha:\n')  #informções de menu
    print(16*'-'+'\n1-INICIAR      |\n'+16*'-'+'\n'+16*'-'+'\n2-REGRAS       |\n'+16*'-'+'\n'+16*'-'+'\n3-MUDAR JOGADOR|\n'+16*'-'+'\n'+16*'-'+'\n4-SAIR         |\n'+16*'-')
    escolha_menu = input('\nDigite aqui o número conforme a escolha:\n>-->> ')
    
