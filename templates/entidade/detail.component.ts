import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { I${entidade.singularNameUpper} } from './${entidade.nameLower}';
import { ${entidade.singularNameUpper}Service } from './${entidade.nameLower}.service';

@Component({
  templateUrl: './${entidade.nameLower}-detail.component.html',
  styleUrls: ['./${entidade.nameLower}-detail.component.css']
})
export class ${entidade.singularNameUpper}DetailComponent implements OnInit {
  pageTitle = '${entidade.singularNameUpper} Detail';
  errorMessage = '';
  ${entidade.nameLower}: I${entidade.singularNameUpper} | undefined;

constructor(private route: ActivatedRoute,
              private router: Router,
              private ${entidade.nameLower}Service: ${entidade.singularNameUpper}Service) {
  }

  ngOnInit(): void {
    const id = Number(this.route.snapshot.paramMap.get('id'));
    if (id) {
      this.get${entidade.singularNameUpper}(id);
    }
  }
  get${entidade.singularNameUpper}(id: number): void {
    this.${entidade.nameLower}Service.get${entidade.singularNameUpper}(id).subscribe({
      next: ${entidade.nameLower} => this.${entidade.nameLower} = ${entidade.nameLower},
      error: err => this.errorMessage = err
    });
  }

  onBack(): void {
    this.router.navigate(['/${entidade.pluralNameLower}']);
  }
}