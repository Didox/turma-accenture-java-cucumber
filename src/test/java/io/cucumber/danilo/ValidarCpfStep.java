package io.cucumber.danilo;

import io.cucumber.java.an.E;
import io.cucumber.java.pt.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class ValidarCpfStep {
  public WebDriver browser;
  
  @Dado("que eu esteja na pagina de validação de cpf")
  public void que_eu_esteja_na_pagina_de_validacao_de_cpf() {
    System.setProperty("webdriver.chrome.driver", "driver/chromedriver");

    browser = new ChromeDriver();
    browser.get("http://localhost:8080/");
  }

  @Dado("digito um cpf válido {string}")
  public void digito_um_cpf_valido(String string) {
    WebElement campoNome = browser.findElement(By.name("nome"));
    campoNome.sendKeys("Danilo");

    WebElement campoCpf = browser.findElement(By.name("cpf"));
    campoCpf.sendKeys(string);
  }

  @E("digito um cpf inválido {string}")
  public void digito_um_cpf_invalido(String string) {
    WebElement campoNome = browser.findElement(By.name("nome"));
    campoNome.sendKeys("Danilo");

    WebElement campoCpf = browser.findElement(By.name("cpf"));
    campoCpf.sendKeys(string);
  }

  @Quando("eu clico no botão enviar")
  public void eu_clico_no_botao_enviar() {
      WebElement campoCpf = browser.findElement(By.className("btn-primary"));
      campoCpf.click();
  }

  @Entao("devo ver uma mensagem de {string}")
  public void devo_ver_uma_mensagem_de(String string) {
      String mensagem = browser.findElement(By.className("alert-success")).getText();
      assertEquals(string, mensagem);
      browser.quit();
  }

  @Entao("devo ver uma mensagem de {string} para inválido")
  public void devo_ver_uma_mensagem_de_para_inválido(String string) {
    String mensagem = browser.findElement(By.className("alert-danger")).getText();
    assertEquals(string, mensagem);
    browser.quit();
  }
}
